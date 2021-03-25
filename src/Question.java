import java.util.ArrayList;
import java.util.Scanner;

abstract class Question{
    private String question;

    public Question(String question){
        this.question = question;
    }

    public String getQuestion(){
        return question;
    }

    public abstract boolean doQuestion(Integer input);
    public abstract String displayCorrectAnswer();
    public abstract String displayQuestion();
    public abstract boolean validateInput(String input);
}