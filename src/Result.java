import java.util.ArrayList;

class Result{
    private Student hasStudent;
    private ArrayList<ResultQuestion> hasResultQuestions;
    private Examen hasExam;

    public Result(Student hasStudent, ArrayList<ResultQuestion> hasResultQuestions, Examen hasExam) {
        this.hasExam = hasExam;
        this.hasStudent = hasStudent;
        this.hasResultQuestions = hasResultQuestions;
    }

    public Boolean getResult(){
        int correct = 0;
        for (ResultQuestion resultQuestion: hasResultQuestions) {
            if (resultQuestion.getResult()) {
                correct++;
            }
        }
        int avgQuestions = Math.round(hasResultQuestions.size() / 2);
        return (correct >= (avgQuestions == 0?1:avgQuestions) );

    }

    public Examen getExam(){
        return hasExam;
    }

    public Student getHasStudent() {
        return hasStudent;
    }

}