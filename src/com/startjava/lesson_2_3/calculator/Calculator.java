package com.startjava.lesson_2_3.calculator;

public class Calculator {

    public double calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        int a = Integer.parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int b = Integer.parseInt(partsExpression[2]);
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