import java.util.ArrayList;
import java.util.Scanner;

class Question{
    private String question;
    private Integer maxChoices;
    private ArrayList<String> choices;
    private Integer answer;
    private Integer input;

    public void Question(String question, Integer maxChoices,  ArrayList<String> choices, Integer answer){
        this.question = question;
        this.maxChoices = maxChoices;
        this.choices = choices;
        this.answer = answer;
        this.input = input;
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
        return answer;
    }

    public ArrayList<String> getRandomChoices(){
        return choices;

    }
    public Boolean doQuestion(String[] randomChoice, Integer answer, Integer input){

        System.out.println(this.getQuestion());
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
    }



    public String displayQuestion(String[] randomChoice){
        String displayedQuestion = question;
        for (int i = 0; i < this.maxChoices; i++){

    public String displayQuestion(String[] randomChoice, String question){
        this.question = question;
        String displayedQuestion = question;
        for (int i = 0; i <= this.maxChoices; i++){

            displayedQuestion += "\n"+(i+1)+") " + randomChoice[i];
        }
        return displayedQuestion;
    }

    public Boolean validateInput(String input){

    }



}