package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        double result;
        String inputString;
        do {
            if(answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                inputString = scanner.nextLine();
                result = calculator.calculate(inputString);
                System.out.println(inputString + " = " + result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.nextLine();
        } while(!answer.equals("no"));
    }
}