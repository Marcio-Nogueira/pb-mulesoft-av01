package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    User.registerUsers();

    System.out.println("Digite seu nome de usuário");
    String userName = scanner.nextLine();
    System.out.println("Digite sua senha");
    String password = scanner.nextLine();

    Login.login(userName, password);
    Login.loginMessage(Login.isValid, Login.time);

    }
}
