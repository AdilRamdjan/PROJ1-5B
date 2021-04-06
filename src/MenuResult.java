
import java.util.ArrayList;

class MenuResult extends Menu {
    private ArrayList<Result> resultList;

    public MenuResult(ArrayList<Result> results) {
        this.resultList = results;
    }
    public MenuResult(){
        this.resultList = new ArrayList<Result>();
    }



    public ArrayList<Examen> getPassedExams(Student student){
        ArrayList<Examen> passedExamList = new ArrayList<Examen>();
        for (Result result : resultList){
            if (student.getStudentNumber().equals(result.getHasStudent().getStudentNumber())){
                if (result.getResult()){
                    passedExamList.add(result.getExam());
                }
            }
        }
        return passedExamList;
    }

    public boolean addResult(Result result){
        return resultList.add(result);
    }

    public void DisplayMenu() {

    }

}
