import java.util.ArrayList;

class MenuExamen extends Menu{
    private ArrayList<Examen> examList;
    public MenuExamen() {
        examList = new ArrayList<Examen>();
    }

    public void DisplayMenu() {
        System.out.println("1) Examens weergeven\n" + "2) Nieuw examen\n");
    }
    public ArrayList<Examen> getExamens(){
        return examList;
    }
    public String displayExams(){
        int i = 1;
        String examens = "";
        for (Examen examen : examList){
            examens += i + ") " + examen.getExamenNaam() + "\n";
            i++;
        }
        return examens;
    }
    public boolean addExam(Examen examen){
        if(examList.add(examen)){
            return true;
        }else{return false;}
    }



   //public boolean makeExam(String examName, Question[] questions){
   //     Examen exam = new Examen(examName);
   //     exam.addQuestions(questions);
   //     return examList.add(exam);
   // }
}
