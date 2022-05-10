package com.startjava.lesson_2_3.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int countAttempt = 0;
    private int[] enteredNumbs = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempt() {
        return countAttempt;
    }

    public int[] getEnteredNumbs() {
        return Arrays.copyOf(enteredNumbs, countAttempt);
    }

    public int getEnteredNum() {
        return enteredNumbs[countAttempt - 1];
    }

    public void setEnteredNum(int number) {
        this.enteredNumbs[countAttempt] = number;
        countAttempt++;
    }

    public void reset() {
        Arrays.fill(enteredNumbs, 0, countAttempt, 0);
        countAttempt = 0;
    }

}