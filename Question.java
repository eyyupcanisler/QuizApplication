public class Question {
    private int id;
    private String text;

    public Question(String text) {
        this.text = text;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        String s = String.format("ID: %d: %s", id, text);
        return s;
    }

}
