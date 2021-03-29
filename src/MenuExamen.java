import java.util.ArrayList;

class MenuExamen extends Menu{
    private ArrayList<Examen> examList;
    public MenuExamen(Examen[] Exam, Student student) {
        super(Exam, student);
    }

    public void DisplayMenu() {
        displayExams();
    }
    public ArrayList<Examen> getExamens(){
        return examList;
    }
    public void displayExams(){
        for (int i = 0; i >= getExamens().size(); i++){
            System.out.println(getExamens().get(i));
        }
    }
    public boolean makeExam(Student student, Examen Exam){
        examList.add(Exam);
        return true;
    }
}
