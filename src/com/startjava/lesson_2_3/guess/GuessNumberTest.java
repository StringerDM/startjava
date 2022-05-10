package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        while (!answer.equals("no")) {
            if(answer.equals("yes")) {
                game.run();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }
}