import java.util.ArrayList;

class Examen {
    private String name;
    private ArrayList<Question> hasQuestions;

    public Examen(String name, ArrayList<Question> hasQuestions) {
        this.hasQuestions = hasQuestions;
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public ArrayList<Question> getQuestions() {
        return hasQuestions;
    }

}