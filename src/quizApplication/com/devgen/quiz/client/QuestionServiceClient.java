package quizApplication.com.devgen.quiz.client;

import quizApplication.com.devgen.quiz.model.Question;
import quizApplication.com.devgen.quiz.service.QuestionService;

public class QuestionServiceClient {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        Question question1 = new Question(6, "Java Born year", "1885", "1920", "2005", "1995","1995");
        questionService.addQuestion(question1);

        Question question2 = new Question(7, "Java Born year", "1885", "1920", "2005", "1995","1995");
        questionService.addQuestion(question2);

        Question question3 = new Question(8, "Java Born year", "1885", "1920", "2005", "1995","1995");
        questionService.addQuestion(question3);

        Question question4 = new Question(9, "Java Born year", "1885", "1920", "2005", "1995","1995");
        questionService.addQuestion(question4);

        Question question5 = new Question(10, "Java Born year", "1885", "1920", "2005", "1995","1995");
        questionService.addQuestion(question5);
    }
}
