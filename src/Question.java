import java.util.ArrayList;

class Question{
    private String question;
    private Integer maxChoices;
    private ArrayList<String> choices;
    private Integer answer;

    public void Question(String question, Integer maxChoices,  ArrayList<String> choices, Integer answer){
        this.question = question;
        this.maxChoices = maxChoices;
        this.choices = choices;
        this.answer = answer;

    }
    public String getQuestion(){
        return question;
    }
    public ArrayList<String> getChoices(){
        return choices;
    }
    public Integer getAnswer(){
        return answer;
    }


    public Integer getAnswer(String[] randomChoices){

    }

    public String[] getRandomChoices(){

    }
    public Boolean doQuestion(String[] randomChoice, Integer answer, Integer input){

    }
}