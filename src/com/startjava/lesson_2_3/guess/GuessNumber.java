package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private int playerNum = 0;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void run() {
        player1.reset();
        player2.reset();
        System.out.println("Игра началась, у каждого игрока по 10 попыток");
        int hiddenNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число в диапазоне (0, 100] ");
        currentPlayer = player1;
        Scanner scanner = new Scanner(System.in);
        int roundsNum = 10;
        while(player2.getCountAttempt() != roundsNum) {
            System.out.print("Игрок " + currentPlayer.getName() + " введите число: ");
            currentPlayer.setEnteredNum(scanner.nextInt());
            if(currentPlayer.getEnteredNum() == hiddenNumber) {
                break;
            } else if (currentPlayer.getEnteredNum() > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            if(currentPlayer.getCountAttempt() > 9) {
                System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки");
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        }
        if(currentPlayer.getEnteredNum() == hiddenNumber) {
            System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                    + currentPlayer.getEnteredNum() + " с " + currentPlayer.getCountAttempt() + " попытки");
        } else {
            System.out.println("Никто не выиграл");
        }
        printInputNumbers();
    }

    private void printInputNumbers() {
        Player[] players = {player1, player2};
        for (Player player : players) {
            System.out.println("Числа введенные игроком " + player.getName());
            int[] playerNumbers = player.getEnteredNumbs();
            int count = 0;
            for (int playerNumber : playerNumbers) {
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
                System.out.print(playerNumber + " ");
                count++;
            }
            System.out.println();
        }
    }
}