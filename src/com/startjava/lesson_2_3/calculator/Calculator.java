package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public double calculate(String[] inputData) {
        a = Integer.parseInt(inputData[0]);
        sign = inputData[1].charAt(0);
        b = Integer.parseInt(inputData[2]);
        switch(sign) {
            case '+' : 
                return Math.addExact(a, b);
            case '-' :
                return Math.subtractExact(a, b);
            case '*' :
                return Math.multiplyExact(a, b);
            case '/' :
                return (double) a / b;
            case '^' :
                return Math.pow(a, b);
            case '%' :
                return a % b;
            default:
                return 0;
        }
    }
}