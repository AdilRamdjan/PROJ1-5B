import java.util.ArrayList;

class Examen {
    private String examenNaam;
    private ArrayList<Question> questionList;

    public Examen(String examenNaam) {
        this.examenNaam = examenNaam;
        questionList = new ArrayList<Question>();

    }

    public String getExamenNaam() {

        return examenNaam;
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