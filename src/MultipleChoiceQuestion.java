import java.util.regex.Pattern;

class MultipleChoiceQuestion extends Question {
    private int answerIndex;
    private String[] choices;

    public MultipleChoiceQuestion(String question, String[] choices, Integer answer){
        super(question);
        this.choices = choices;
        this.answerIndex = answer;
    }

    public int getAnswerIndex(){
        return this.answerIndex;
    }

    public boolean doQuestion(Integer input) {
        return this.choices[this.answerIndex].equals(choices[input]);
    }

    public String displayQuestion(){
        String displayedQuestion = this.getQuestion() + "?";
        for (int i = 0; i < 4; i++){
            displayedQuestion += "\n  "+(i+1)+") " + this.choices[i];
        }
        return displayedQuestion;
    }

    public boolean validateInput(String input) {
        return (Pattern.matches("[1-4]", input));
    }

    public String displayCorrectAnswer() {
        return "Het goede antwoord was: " + getAnswerIndex()+1 + ".";
    }
}