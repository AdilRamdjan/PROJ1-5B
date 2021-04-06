import java.util.ArrayList;

class Examen {
    private String examName;
    private ArrayList<Question> questionList;

    public Examen(String examName, ArrayList<Question> questionList) {
        this.questionList = questionList;
        this.examName = examName;

    }
    public Examen(){
        questionList = new ArrayList<Question>();
    }

    public String getExamenNaam() {

        return examName;
    }


    public ArrayList<Question> getQuestions() {
        return questionList;
    }

    public void addQuestions(Question[] question) {
        for (int i = 0; i <= question.length; i++) {
            this.questionList.add(question[i]);
        }
    }
}