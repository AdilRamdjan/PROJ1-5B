import java.util.ArrayList;

class Examen{
    private String examenNaam;
    private Integer maxQ;
    private ArrayList<String> Question = new ArrayList<String>();

    public void Examen(String examenNaam){
        this.examenNaam = examenNaam;
    }
    public String getExamenNaam(){
        return examenNaam;
    }
    public Integer getMaxQ(){
        return maxQ;
    }
    public Question[] getQuestions(){

    }
    public Question[] getRandomQuestions(){

    }
    public void addQuestions(Question question){

    }
}