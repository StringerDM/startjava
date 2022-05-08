package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "";
        double result = 0;
        do {
            System.out.println("Введите первое число:");
            calculator.setA(scanner.nextInt());
            System.out.println("Введите знак математической операции:");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setB(scanner.nextInt());
            result = calculator.calculate();
            System.out.println(calculator.getA() + " " + calculator.getSign() + " " 
                    + calculator.getB() + " = " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}