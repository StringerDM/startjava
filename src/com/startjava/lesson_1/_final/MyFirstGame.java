package com.startjava.lesson_1._final;

public class MyFirstGame {

    public static void main(String[] args) {
        int compNum = 23;
        int userNum = 51;
        int minNum = 1;
        int maxNum = 100;
        while(compNum != userNum) {
            if(compNum > userNum) {
                System.out.println("число " + userNum +" меньше того, что загадал компьютер");
                minNum = userNum;
                userNum = (minNum + maxNum) / 2;
            } else {
                System.out.println("число " + userNum +" больше того, что загадал компьютер");
                maxNum = userNum;
                userNum = (minNum + maxNum) / 2;
            }
        }
        System.out.println("Вы победили!");
    }
}