package com.startjava.lesson_2_3.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attemptCount = 0;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void saveNumber(int number) {
        this.numbers[attemptCount] = number;
    }

    public void incrementAttemptCount() {
        attemptCount++;
    }

    public void reset() {
        Arrays.fill(numbers, 0, attemptCount, 0);
        attemptCount = 0;
    }

}