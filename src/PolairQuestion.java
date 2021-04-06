import java.util.regex.Pattern;

class PolairQuestion extends Question{
    boolean answer;
    public PolairQuestion(String question, boolean answer) {
        super(question);
        this.answer = answer;
    }

    public String displayQuestion() {
        return getQuestion() + "?\n" +
                "1: True\n" +
                "2: False\n";
    }

    public boolean validateInput(String input) {
        return Pattern.matches("[1-2]", input);
    }

    public String displayCorrectAnswer() {
        String answer = (this.answer) ? "True" : "False";
        return "The right answer was: " +  answer;
    }

    public boolean doQuestion(Integer input) {
        boolean expectedInput = (input == 1);
        return (expectedInput == this.answer);
    }
}
