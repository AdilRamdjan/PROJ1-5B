
import java.util.ArrayList;

class MenuResult extends Menu {
    private ArrayList<Result> hasResults;


    public MenuResult(){
        this.hasResults = new ArrayList<Result>();
    }



    public ArrayList<Examen> getPassedExams(Student student){
        ArrayList<Examen> passedExamList = new ArrayList<Examen>();
        for (Result result : hasResults){
            if (student.getStudentNumber().equals(result.getHasStudent().getStudentNumber())){
                if (result.getResult()){
                    passedExamList.add(result.getExam());
                }
            }
        }
        return passedExamList;
    }

    public boolean addResult(Result result){
        return hasResults.add(result);
    }

    public String DisplayMenu() {
        return "";
    }

}
