package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    boolean closeApp = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quiz de perguntas e respostas\n" +
                "Digite seu nome para começar o jogo");
        User user = new User(scanner.nextLine());

        Question.generateQuestions();

        for ( int i = 0; i < Question.questions.size(); i++) {
            System.out.println(Question.questions.get(i).getQuestion());
            String answer = scanner.nextLine();
            boolean isCorrect = Question.validateQuestions(Question.questions.get(i).getAnswer(), answer);
            if (isCorrect == true) {
                user.setCorrect();
            } else {
                user.setError();
            }
        }
        System.out.println("Jogador: " + user.getName());
        System.out.println("Acertos: " + user.getCorrect());
        System.out.println("Erros " + user.getError());
    }
}
