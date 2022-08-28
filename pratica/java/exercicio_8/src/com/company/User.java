package com.company;

public class User {
    private String name;
    private int correct;
    private int error;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCorrect() {
        return correct;
    }

    public User setCorrect() {
        this.correct = correct + 1;
        return this;
    }

    public int getError() {
        return error;
    }

    public User setError() {
        this.error = error + 1;
        return this;
    }
}
