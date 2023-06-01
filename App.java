
public class App {
    public static void main(String[] args) throws Exception {

        String[] options1 = { "Ankara", "Istanbul", "Konya", "Bursa" };
        MultipleChoiceQ q1 = new MultipleChoiceQ(
                "What is the capital of Turkey",
                options1,
                0);
        QuestionController.addQ(q1);

        String[] options2 = { "Jaen", "Lima", "Bogota", "Santiago" };
        MultipleChoiceQ q2 = new MultipleChoiceQ(
                "What is the capital of Peru",
                options2,
                1);
        QuestionController.addQ(q2);

        TrueFalseQ q3 = new TrueFalseQ(
                "London is more populated than Ankara.",
                true);
        QuestionController.addQ(q3);

        TrueFalseQ q4 = new TrueFalseQ(
                "Lima is bigger than Istanbul.",
                true);
        QuestionController.addQ(q4);

        shortAnswerQ q5 = new shortAnswerQ("Who is the legendary basketball player called 'Mamba'.", "Kobe Braynt");
        QuestionController.addQ(q5);

        QuestionController.listQuestions();

        System.out.println("\nSearching for Mamba:");
        System.out.println(QuestionController.findQ("Mamba"));

        boolean isDeleted = QuestionController.deleteQ(2);
        if (isDeleted)
            System.out.println("Question is deleted.");
        else
            System.out.println("Question was not found.");
        isDeleted = QuestionController.deleteQ(8);
        if (isDeleted)
            System.out.println("Question is deleted.");
        else
            System.out.println("Question was not found.");

        QuestionController.listQuestions();

    }
}
