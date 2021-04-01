import java.util.ArrayList;

class Result{
    private Student hasStudent;
    private ArrayList<ResultQuestion> hasResultQuestion;

    public Result(Student hasStudent, ArrayList<ResultQuestion> hasResultQuestion) {
        this.hasStudent = hasStudent;
        this.hasResultQuestion = hasResultQuestion;
    }

    public Boolean getResult(){
        int correct = 0;
        for (ResultQuestion resultQuestion: hasResultQuestion) {
            if (resultQuestion.getResult()) {
                correct++;
            }
        }
        return (correct >= Math.round(hasResultQuestion.size() / 2));
    }

    public Student getHasStudent() {
        return hasStudent;
    }

    public ArrayList<ResultQuestion> getHasResultQuestion() {
        return hasResultQuestion;
    }
}