package quizApplication.com.devgen.quiz.model;

public class QuizResult {
    private int correctAnswers;
    private int incorrectAnswers;
    private double percentage;
    private String Suggestion;


    public QuizResult(int correctAnswers, int incorrectAnswers, double percentage, String suggestion) {
        this.correctAnswers = correctAnswers;
        this.incorrectAnswers = incorrectAnswers;
        this.percentage = percentage;
        Suggestion = suggestion;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public String getSuggestion() {
        return Suggestion;
    }

    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public double getPercentage() {
        return percentage;
    }
}
