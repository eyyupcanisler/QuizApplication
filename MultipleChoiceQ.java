public class MultipleChoiceQ extends Question {

    private String[] answer;
    private int correctAnswer;

    public MultipleChoiceQ(String text, String[] answer, int correctAnswer) {
        super(text);

        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    public String[] getAnswer() {
        return answer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        String str = String.format(super.toString());
        str += "\n\tOptions: ";
        for (String s : answer) {
            if (answer[correctAnswer].equals(s))
                str += "*";
            str += s + " ";
        }
        return str;
    }
}