public class ResultQuestion {
    private Integer input;
    private Question hasResultQuestions;

    public ResultQuestion(Integer input, Question hasResultQuestions) {
        this.input = input;
        this.hasResultQuestions = hasResultQuestions;
    }
    public boolean getResult() {
        return hasResultQuestions.doQuestion(this.input);
    }
}
