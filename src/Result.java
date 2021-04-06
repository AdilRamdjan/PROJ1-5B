import java.util.ArrayList;

class Result{
    private Student hasStudent;
    private ArrayList<ResultQuestion> hasresultquestion;
    private Examen hasExam;

    public Result(Student hasStudent, ArrayList<ResultQuestion> hasresultquestion, Examen examen) {
        this.hasExam = examen;
        this.hasStudent = hasStudent;
        this.hasresultquestion = hasresultquestion;
    }


    public Examen getExam(){
        return hasExam;
    }

    public Boolean getResult(){
        int correct = 0;
        for (ResultQuestion resultQuestion: hasresultquestion) {
            if (resultQuestion.getResult()) {
                correct++;
            }
        }
        int avgQuestions = Math.round(hasresultquestion.size() / 2);
        return (correct >= (avgQuestions == 0?1:avgQuestions) );

    }

    public Student getHasStudent() {
        return hasStudent;
    }

    public ArrayList<ResultQuestion> getHasResultQuestion() {
        return hasresultquestion;
    }
}