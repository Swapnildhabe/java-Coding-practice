package quizApplication.com.devgen.quiz.service;

import quizApplication.com.devgen.quiz.model.Question;

import java.util.Scanner;

public class QuestionService {
    //maintaining question = (CURD) - Create, Read, Update, Delete

    public Question [] questions = new Question[10];
    private int current;


    public QuestionService() {
        questions[current++] = new Question(1, "Size of short data type", "2", "4", "1", "8", "2");

        questions[current++] = new Question(2, "Size of Int data type", "2", "4", "1", "8", "4");

        questions[current++] = new Question(3, "Size of float data type", "2", "4", "1", "8", "4");

        questions[current++] = new Question(4, "Size of double data type", "2", "4", "1", "8", "8");

        questions[current++] = new Question(5, "Size of char data type", "2", "4", "1", "8", "2");
    }

    public Question[] getQuestions() {
        return questions;
    }

    public  String addQuestion(Question question){
            questions[current] = question;
            current++;
        return "Question Added Successfully";
    }

    public  String updateQuestion(Question question){
        return "Question updated Successfully";
    }

    public  String deleteQuestion(int id){
        return "Question deleted Successfully";
    }
    public  Question[] getAllQuestions(){
        return questions;
    }

}

