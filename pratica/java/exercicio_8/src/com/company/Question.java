package com.company;

import java.util.ArrayList;

public class Question {
    private String question;
    private String answer;

    public static ArrayList<Question> questions = new ArrayList<Question>();

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public static void generateQuestions() {
        questions.add(new Question("Qual é a melhor linguagem de programação back-end?", "Java"));
        questions.add(new Question("Quem criou a linguagem de programação Java?", "James Gosling"));
        questions.add(new Question("Em qual ano surgiu o primeiro computador?", "1946"));
        questions.add(new Question("Por qual nome ficou conhecido o primeiro computador?", "ENIAC"));
        questions.add(new Question("Em qual ano foi fundada a empresa Compasso?", "1995"));
     }

     public static boolean validateQuestions(String correctAnswer, String answer) {
        if (correctAnswer.equals(answer)) {
            return true;
        }
            return false;
     }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

}
