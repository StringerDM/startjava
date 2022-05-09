package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "";
        double result = 0;
        String[] inputData = new String[3];
        do {
            System.out.print("Введите математическое выражение: ");
            inputData = scanner.nextLine().split(" ");
            calculator.setA(Integer.parseInt(inputData[0]));
            calculator.setSign(inputData[1].charAt(0));
            calculator.setB(Integer.parseInt(inputData[2]));

            result = calculator.calculate();
            System.out.println(calculator.getA() + " " + calculator.getSign() + " " 
                    + calculator.getB() + " = " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}