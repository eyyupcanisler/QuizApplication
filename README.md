# Quiz Application

This Java application implements a simple quiz with multiple-choice, true/false, and short answer questions. It allows users to add, list, search, and delete questions from the quiz.

## Usage

1. Run the `App` class as the main entry point of the application.
2. The `App` class contains a `main` method that demonstrates the usage of the quiz application.
3. The sample questions are added to the quiz using different question types: `MultipleChoiceQ`, `TrueFalseQ`, and `ShortAnswerQ`.
4. The questions are stored in the `QuestionController`, which provides methods to add, list, search, and delete questions.
5. The `Question` class represents a generic question with an ID and text.
6. The `MultipleChoiceQ` class represents a multiple-choice question with options and a correct answer.
7. The `TrueFalseQ` class represents a true/false question with a boolean answer.
8. The `ShortAnswerQ` class represents a short answer question with a string answer.

## Functionality

- Adding a Question:
  - To add a question, create an instance of the desired question type (`MultipleChoiceQ`, `TrueFalseQ`, or `ShortAnswerQ`) with the required parameters.
  - Use the `QuestionController.addQ(Question question)` method to add the question to the quiz.

- Listing Questions:
  - Use the `QuestionController.listQuestions()` method to display a list of all the questions in the quiz.

- Searching for a Question:
  - Use the `QuestionController.findQ(String text)` method and provide a search text to find a specific question in the quiz. It performs a case-insensitive search and returns the matching question.

- Deleting a Question:
  - Use the `QuestionController.deleteQ(int id)` method and provide the ID of the question to delete it from the quiz. It returns `true` if the question was found and deleted successfully, otherwise `false`.

## Classes

- `App.java`: The main class that demonstrates the usage of the quiz application.
- `QuestionController.java`: Manages the quiz questions and provides methods to add, list, search, and delete questions.
- `Question.java`: Represents a generic question with an ID and text.
- `MultipleChoiceQ.java`: Represents a multiple-choice question with options and a correct answer.
- `TrueFalseQ.java`: Represents a true/false question with a boolean answer.
- `ShortAnswerQ.java`: Represents a short answer question with a string answer.

## Author

This quiz application was created by [Your Name] as a coding exercise. Feel free to modify and enhance it as per your requirements.

Enjoy the quiz!
