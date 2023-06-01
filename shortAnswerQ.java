public class shortAnswerQ extends Question {
    private String answer;

    public shortAnswerQ(String text, String answer) {
        super(text);
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {

        return super.toString() + "\n\tAnswer: " + answer;
    }
}
