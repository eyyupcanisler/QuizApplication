public class TrueFalseQ extends Question {

    private boolean answer;

    public TrueFalseQ(String text, boolean answer) {
        super(text);

        this.answer = answer;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {

        return super.toString() + "\n\tAnswer: " + answer;
    }
}
