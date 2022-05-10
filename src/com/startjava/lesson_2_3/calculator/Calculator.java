package com.startjava.lesson_2_3.calculator;

public class Calculator {

    public double calculate(String mathExpression) {
        int a;
        int b;
        char sign;
        String[] partsExpression = mathExpression.split(" ");
        a = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        b = Integer.parseInt(partsExpression[2]);
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