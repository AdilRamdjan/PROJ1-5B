public class ResultQuestion {
    private Integer input;
    private Question question;

    public ResultQuestion(Integer input, Question question) {
        this.input = input;
        this.question = question;
    }

    public Integer getInput() {
        return input;
    }

    public boolean getResult() {
        return question.doQuestion(this.input);
    }
}
