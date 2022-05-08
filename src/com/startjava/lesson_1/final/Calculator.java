package com.startjava.lesson_1.final;

public class Calculator {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        char sign = '/';
        double result = 1;
        if(sign == '+') {
            result = a + b;
        } else if(sign == '-') {
            result = a - b;
        } else if(sign == '*') {
            result = a * b;
        } else if(sign == '/') {
            result = (double) a / b;
        } else if(sign == '^') {
            for(int i = 0; i < b; i++) {
                result *= a; 
            }
        } else (sign == '%') {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}