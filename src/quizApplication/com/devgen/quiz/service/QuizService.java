package quizApplication.com.devgen.quiz.service;

import quizApplication.com.devgen.quiz.model.Question;
import quizApplication.com.devgen.quiz.model.QuizResult;

import java.util.Scanner;

public class QuizService {


    private Question[] questions;
    QuestionService questionService;
    private String[] userSerlectedAnswer = new String[5];

    public QuizService(QuestionService questionService){
         this.questionService = questionService;
         questions = questionService.getAllQuestions();

    }

    public void playQuiz(){

        for (int i=0; i< questionService.questions.length;i++ )
        {
            System.out.println("Question: " +questionService.questions[i].getId());
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());

            Scanner sc = new Scanner(System.in);
            userSerlectedAnswer[i] = sc.next();

        }
    }


    public QuizResult getResult(){
        int correctAnswer=0;
        for (int i=0; i< userSerlectedAnswer.length;i++){
            if(questions[i].getAnswer().equals(userSerlectedAnswer[i])){
                correctAnswer++;
            }
        }
        int inccorectAnswer = questions.length - correctAnswer;

        float percentage = ((float)correctAnswer / questions.length) * 100;
        String suggestion = "";
        if(percentage >= 0 && percentage <= 30){
            suggestion=" You Must study much harder.";
        } else if (percentage >= 31 && percentage <= 60) {
            suggestion="You are studing good. need some more study.";
        } else if (percentage >= 61 && percentage <= 90) {
            suggestion="You are becoming topper and just bit of extra effors little reuired.";
        }else {
            suggestion="You are very good at concepts and beig into top list.";
        }

        QuizResult quizResult = new QuizResult(correctAnswer, inccorectAnswer, percentage, suggestion);

        return  quizResult;
//        System.out.println("Correct Answer : "+correctAnswer    );
//        System.out.println("Incorrect Answer : "+ inccorectAnswer);
//        System.out.println("Percentage : "+ percentage );
    }

}
























