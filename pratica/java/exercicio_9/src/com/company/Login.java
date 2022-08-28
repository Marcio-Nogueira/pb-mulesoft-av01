package com.company;

import java.time.LocalTime;

public class Login {
    static boolean isValid;
    static LocalTime time;

    public static boolean login(String userName, String password) {
        for (int i = 0; i < User.users.size(); i++) {
            if (User.validateUser(userName, password, User.users.get(i).getUserName(), User.users.get(i).getPassword())) {
                return isValid = true;
            }
        }
        return isValid = false;
    }

    public static void loginMessage(boolean validUser, LocalTime time) {
        time = LocalTime.now();
        if (validUser == false) {
            System.out.println("Usuário e/ou senha incorretos");
        } else if (time.getHour() >= 6 && time.getHour() < 12) {
            System.out.println("Bom dia, você se logou ao nosso sistema.");
        } else if (time.getHour() >= 12 && time.getHour() < 18) {
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
        } else if (time.getHour() >= 18 ) {
            System.out.println("Boa noite, você se logou ao nosso sistema.");
        } else {
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        }
    }

}
