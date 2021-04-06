import java.util.ArrayList;
import java.util.Scanner;
class Main {

    public ArrayList<Student> studentArrayList;

    public static void main(String[] args) {

        menuStudent menuStudent = new menuStudent();
        MenuExamen menuExamen = new MenuExamen();
        MenuResult menuResult = new MenuResult();

        Student student1 = new Student(20182716, "Adil");
        Student student2 = new Student(20182717, "ADIL");
        menuStudent.addUniqueStudent(student1);
        menuStudent.addUniqueStudent(student2);



        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while(!(choice == 0)){

            //Main menu
            System.out.println("Menu:\n" +
                    "1) Examlist\n" +
                    "2) Studentlist\n" +
                    "3) Add new student\n" +
                    "4) Delete student\n" +
                    "5) Take exam\n" +
                    "6) Did a student pass an exam\n" +
                    "7) Which student passed the most exams\n" +
                    "8) Make exam\n" +
                    "0) EXIT\n" +
                    "Your choice: ");

            choice = scanner.nextInt();

            //Examlist
            if(choice == 1){

                System.out.println("ExamList: ");
                System.out.println(menuExamen.displayExams());
            }

            //StudentList
            if(choice == 2){
                System.out.println("Students in the system: ");
                System.out.println(menuStudent.displayStudents());
            }

            //Add new student
            else if(choice == 3){
                System.out.println("Please enter studentNumber: ");
                int studentNumber = scanner.nextInt();

                System.out.println("Please enter full name: ");
                String name = scanner.next();

                Student student = new Student(studentNumber, name);
                if(student.validateStudentNumber() && menuStudent.addUniqueStudent(student)){
                    System.out.println("Student added succesfully!");
                }else{
                    System.out.println("Either user already exists or studentnumber is invalid.");
                }
            }

            //Delete student
            else if (choice == 4) {
                System.out.println("Which student do you want to delete: ");
                System.out.println("0) Cancel");
                System.out.println(menuStudent.displayStudents());

                ArrayList<Student> studentArrayList = menuStudent.getStudents();

                int index = scanner.nextInt();
                if(index != 0) {
                    if(menuStudent.deleteStudentExisting(studentArrayList.get(index - 1))) {
                        System.out.println("Student deleted succesfully");
                    }else{
                        System.out.println("Action failed.");
                    }
                }
            }

            //Take Exam
            else if (choice == 5){

                System.out.println("Which exam do you want to make?");
                System.out.println("0) Cancel");
                System.out.println(menuExamen.displayExams());
                int index = scanner.nextInt();
                if(index != 0){
                    Examen currentExam = menuExamen.getExamens().get(index-1);

                    Student student = null;
                    while(student == null){
                        System.out.println("Enter studentnumber:");
                        Integer studentNumber  = Integer.valueOf(scanner.nextInt());
                        student = menuStudent.getStudentByNumber(studentNumber);
                        if (student == null){
                            System.out.println("Student not found, try again");

                        }


                    }
                    ArrayList<Question> currentExamQuestions = currentExam.getQuestions();
                    ArrayList<ResultQuestion> resultQuestions = new ArrayList<ResultQuestion>();
                    for (Question currentQuestion : currentExamQuestions){

                        System.out.println(currentQuestion.displayQuestion());
                        boolean validateAnswer = false;
                        while (!validateAnswer){
                            System.out.println("Enter answer: ");
                            Integer answer = Integer.valueOf(scanner.nextInt());
                            validateAnswer = currentQuestion.validateInput(Integer.toString(answer));
                            if(validateAnswer){

                                if (!currentQuestion.doQuestion(answer)) {
                                    System.out.println(currentQuestion.displayCorrectAnswer());
                                } else {
                                    System.out.println("Correct answer");
                                }
                                ResultQuestion resultQuestion = new ResultQuestion(answer, currentQuestion);
                                resultQuestions.add(resultQuestion);
                            }else{
                                System.out.println("Given input is not recognized");
                            }
                        }
                    }
                    System.out.println("Exam finished");
                    Result result = new Result(student,resultQuestions, currentExam);
                    if (result.getResult()){
                        System.out.println("Exam passed");
                    }else{
                        System.out.println("Exam failed");
                    }
                    student.addResult(result);
                    menuResult.addResult(result);
                }

            }

            //Did a student pass an exam
            else if(choice == 6){
                Student student = null;
                while(student == null){
                    System.out.println("Enter studentnumber:");
                    Integer studentNumber  = Integer.valueOf(scanner.nextInt());
                    student = menuStudent.getStudentByNumber(studentNumber);
                    if (student == null){
                        System.out.println("Student not found, try again");
                    }
                }
                String result = "";
                for (Examen examen : menuResult.getPassedExams(student)){
                    result += examen.getExamenNaam() + "\n";
                }
                System.out.println(result);
            }


            //Which student passed the most exams
            else if(choice == 7){
                Student mostSuccesfullStudent = null;
                int passedExamCount = 0;
                for (Student student : menuStudent.getStudents()){
                   if(menuResult.getPassedExams(student).size() > passedExamCount){
                       mostSuccesfullStudent = student;
                       passedExamCount = menuResult.getPassedExams(student).size();
                   }
                }
                ArrayList<Student> mostSuccesfullStudents = new ArrayList<Student>();
                if(passedExamCount != 0){
                    for (Student student : menuStudent.getStudents()){
                        if (passedExamCount == menuResult.getPassedExams(student).size()){
                            mostSuccesfullStudents.add(student);
                        }
                    }
                }
                if(mostSuccesfullStudent == null && mostSuccesfullStudents.size() == 0){
                    System.out.println("No exams have been taken");
                }
                else if(mostSuccesfullStudents.size() == 0){
                    System.out.println("Most succesfull student:");
                    System.out.println(mostSuccesfullStudent.getName() + " " + mostSuccesfullStudent.getStudentNumber());
                }
                else{
                    String result = "";
                    for (Student student : mostSuccesfullStudents){
                        result += student.getName() + " " + student.getStudentNumber() + "\n";
                    }
                    System.out.println("Most succesfull Students:");
                    System.out.println(result);
                }

            }

            //Make Exam
            else if(choice == 8){
                ArrayList<Question> questionArrayList = new ArrayList<Question>();
                System.out.println("Enter name for exam: ");
                String examName = scanner.next();
                int questionChoice = 1;



                while(questionChoice != 0) {
                    System.out.println("Do you want to add a polair question or a multiple choice question?");
                    System.out.println("0) Stop adding questions\n" +"1) polair\n" + "2) multiple choice" );
                    questionChoice = scanner.nextInt();

                    //polairQuestion
                    if (questionChoice == 1) {
                        int i = 1;
                        while(i != 2){
                            System.out.println("Enter question:");
                            scanner.nextLine();
                            String q1 = scanner.nextLine();
                            System.out.println("Enter right answer:\n" + "1) True\n" + "2) False");

                            boolean trueOrFalse = scanner.nextInt() == 1;

                            PolairQuestion polairQuestion1 = new PolairQuestion(q1, trueOrFalse);
                            if(questionArrayList.add(polairQuestion1)){
                                System.out.println("Question added succesfully");

                            }else{
                                System.out.println("Something went wrong");
                            }
                            System.out.println("Do you want to add another polair question?\n" + "1) Yes\n" + "2) No");

                            i = scanner.nextInt();

                        }

                    //multipleChoiceQuestion
                    }else if(questionChoice == 2){
                        int i = 1;
                        while(i != 2){
                            System.out.println("Enter question:");
                            scanner.nextLine();
                            String q1 = scanner.nextLine();
                            String[] choiceList = new String[4];

                            for(int index = 0 ; index < 4 ; index++){
                                System.out.println("Enter possible answer " + (index + 1) + " out of 4");
                                String answer = scanner.nextLine();
                                choiceList[index] = answer;
                            }

                            for(int index = 0; index < choiceList.length ; index++){
                                System.out.println((index+1) + ") " + choiceList[index]);
                            }

                            System.out.println("Enter answer:");
                            int answer = (scanner.nextInt() -1);
                            Integer chosenAnswer = (Integer.parseInt(choiceList[answer]) -1);

                            MultipleChoiceQuestion mcQuestion = new MultipleChoiceQuestion(q1,choiceList,chosenAnswer);
                            if(questionArrayList.add(mcQuestion)){
                                System.out.println("Question added succesfully");

                            }else {
                                System.out.println("Something went wrong");
                            }
                            System.out.println("Do you want to add another multiple choice question question?\n"
                                    + "1) Yes\n" + "2) No");

                            i = scanner.nextInt();
                        }
                    }
                }

                Examen exam = new Examen(examName, questionArrayList);
                menuExamen.addExam(exam);
                System.out.println("Exam saved succesfully");
            }

            //EXIT
            else if(choice == 0){
                return;
            }
        }
    }
}