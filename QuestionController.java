import java.util.ArrayList;

public class QuestionController {
    private static ArrayList<Question> questions = new ArrayList<>();

    private static int currIndex = 1;

    public static void addQ(Question question) {
        question.setId(currIndex++);
        questions.add(question);
    }

    public static void listQuestions() {
        System.out.println("\n**Questions**");
        for (Question q : questions)
            System.out.println(q);
        if (questions.size() == 0)
            System.out.println("\tNo questions yet.");

    }

    public static Question findQ(String text) {

        Question quest = questions.stream().filter(q -> q.getText().contains(text)).findFirst().orElse(null);

        return quest;
    }

    public static boolean deleteQ(int id) {
        return questions.removeIf(q -> q.getId() == id);
    }
}
