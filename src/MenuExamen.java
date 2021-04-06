import java.util.ArrayList;

class MenuExamen extends Menu{
    private ArrayList<Examen> hasExams;
    public MenuExamen() {
        hasExams = new ArrayList<Examen>();
    }

    public String DisplayMenu() {
        return "1) View exams\n" + "2) Create new exam\n";
    }

    public ArrayList<Examen> getExamens(){
        return hasExams;
    }

    public String displayExams(){
        int i = 1;
        String examens = "";
        for (Examen examen : hasExams){
            examens += i + ") " + examen.getName() + "\n";
            i++;
        }
        return examens;
    }
    public boolean addExam(Examen examen){
        if(hasExams.add(examen)){
            return true;
        }else{return false;}
    }
}
