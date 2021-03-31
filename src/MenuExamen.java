import java.util.ArrayList;

class MenuExamen extends Menu{
    private ArrayList<Examen> examList;
    public MenuExamen() {
        examList = new ArrayList<Examen>();
    }

    public void DisplayMenu(String input) {
        System.out.println("1) Examens weergeven\n" + "2) Nieuw examen\n");
    }
    public ArrayList<Examen> getExamens(){
        return examList;
    }
    public String displayExams(){
        String examens = "";
        for (int i = 0; i >= getExamens().size(); i++){
            examens += i + ") " + getExamens().get(i);
        }
        return examens;
    }
    public boolean makeExam(Examen Exam, String input, Question[] questions){
        Exam = new Examen(input);
        Exam.addQuestions(questions);
        return examList.add(Exam);
    }
}
