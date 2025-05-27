package quizApplication.com.devgen.quiz.client;


import quizApplication.com.devgen.quiz.model.QuizResult;
import quizApplication.com.devgen.quiz.service.QuestionService;
import quizApplication.com.devgen.quiz.service.QuizService;

public class QuizAppClient {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        QuizService quizService = new QuizService(questionService);
        quizService.playQuiz();
        final QuizResult result = quizService.getResult();

        System.out.println("Total correct answers: "+result.getCorrectAnswers());
        System.out.println("Toatal Incorrect answer: "+ result.getIncorrectAnswers());
        System.out.println("Percentage:"+ result.getPercentage());
        System.out.println("Suggestion: "+ result.getSuggestion());
    }
}
