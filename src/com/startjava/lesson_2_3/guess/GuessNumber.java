package com.startjava.lesson_2_3.guess;

import java.util.Arrays;
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
        int count = 0;
        System.out.println("Игра началась, у каждого игрока по 10 попыток");
        int compNum = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число в диапазоне (0, 100] ");
        currentPlayer = player1;
        Scanner scanner = new Scanner(System.in);
        while(count != 20) {
            System.out.print("Игрок " + currentPlayer.getName() + " введите число: ");
            playerNum = scanner.nextInt();
            currentPlayer.saveNumber(playerNum);
            currentPlayer.incrementAttemptCount();
            if(playerNum == compNum) {
                break;
            } else if (playerNum > compNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            count++;
            changeCurrentPlayer();
        }
        if(playerNum == compNum) {
            System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                    + playerNum + " с " + currentPlayer.getAttemptCount() + " попытки");
        } else {
            System.out.println("Никто не выиграл");
        }
        printPlayerInputNumbers(player1);
        printPlayerInputNumbers(player2);

    }

    private void changeCurrentPlayer() {
        if(currentPlayer.getAttemptCount() > 9) {
            System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки");
        }
        if(currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private void printPlayerInputNumbers(Player player) {
        System.out.println("Числа введенные игроком " + player.getName());
        int[] playerNumbers = Arrays.copyOfRange(player.getNumbers(),
                0, player.getAttemptCount());
        for (int i = 0; i < playerNumbers.length; i++) {
            if(i != 4) {
                System.out.print(playerNumbers[i] + " ");
            } else {
                System.out.println(playerNumbers[i]);
            }
        }
        System.out.println();
    }
}