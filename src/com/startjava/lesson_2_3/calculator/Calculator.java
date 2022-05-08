package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
    
    public double calculate() {
        double result = 1;
        switch(sign) {
            case '+' : 
                result = a + b;
                break;
            case '-' : 
                result = a - b;
                break;
            case '*' : 
                result = a * b;
                break;
            case '/' : 
                result = (double) a / b;
                break;
            case '^' : 
                for(int i = 0; i < b; i++) {
                    result *= a; 
                }
                break;
            case '%' : 
                result = a % b;
                break;
        }
        return result;
    }
}