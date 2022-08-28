package com.company;

import java.util.ArrayList;

public class User {
    private String userName;
    private String password;

    public static ArrayList<User> users = new ArrayList<User>();

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static void registerUsers() {
        users.add(new User("marcio", "compasso"));
        users.add(new User("admin", "compasso"));
    }

    public static boolean validateUser(String username, String password, String regUSer, String regPassoword) {
        if (username.equals(regUSer) && password.equals(regPassoword)) {
            return true;
        }
        return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
