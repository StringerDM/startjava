package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;
        double result;
        String inputString;
        String[] inputData;
        do {
            System.out.print("Введите математическое выражение: ");
            inputString = scanner.nextLine();
            inputData = inputString.split(" ");
            result = calculator.calculate(inputData);
            System.out.println(inputString + " = " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}