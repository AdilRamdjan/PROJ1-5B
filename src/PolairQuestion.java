import java.util.regex.Pattern;

class PolairQuestion extends Question{
    boolean answer;
    public PolairQuestion(String question, boolean answer) {
        super(question);
        this.answer = answer;
    }

    public String displayQuestion() {
        return getQuestion() + "?\n" +
                "1: Ja\n" +
                "2: Nee\n";
    }

    public boolean validateInput(String input) {
        return Pattern.matches("[1-2]", input);
    }

    public String displayCorrectAnswer() {
        String answer = (this.answer) ? "Ja" : "Nee";
        return "Het goede antwoord was: " +  answer;
    }

    public boolean doQuestion(Integer input) {
        boolean expectedInput = (input == 1);
        return (expectedInput == this.answer);
    }
}
