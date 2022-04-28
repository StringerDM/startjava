class CyclesTheme {

    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел:");
        int srcNum1 = -10;
        int evenNumSum = 0;
        int oddNumSumm = 0;
        do {
            if(srcNum1 % 2 == 0) {
                evenNumSum += srcNum1;
            } else oddNumSumm += srcNum1;
            srcNum1++;
        } while(srcNum1 <= 21);
        System.out.println("Сумма четных чисел равна " + evenNumSum);
        System.out.println("сумма нечетных чисел равна " + oddNumSumm);

        //2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min:");
        int srcNum2_1 = 10;
        int srcNum2_2 = 5;
        int srcNum2_3 = -1;
        int maxNum = 0;
        int minNum = 0;
        if(srcNum2_1 >= srcNum2_2 && srcNum2_1 >= srcNum2_3) {
            maxNum = srcNum2_1;
            if (srcNum2_2 >= srcNum2_3) {
                minNum = srcNum2_3;
            } else {
                minNum = srcNum2_2;
            }
        } else if(srcNum2_2 >= srcNum2_3 && srcNum2_2 >= srcNum2_1) {
            maxNum = srcNum2_2;
            if (srcNum2_1 >= srcNum2_3) {
                minNum = srcNum2_3;
            } else {
                minNum = srcNum2_1;
            }
        } else if(srcNum2_3 >= srcNum2_1 && srcNum2_3 >= srcNum2_2) {
            maxNum = srcNum2_3;
            if (srcNum2_1 >= srcNum2_2) {
                minNum = srcNum2_2;
            } else {
                minNum = srcNum2_1;
            }
        } 
        System.out.println("Числа в диапазоне от " + minNum + " до " + maxNum +": ");
        for(int i = minNum; i < maxNum; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(maxNum + ".");

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр:");
        int srcNum3 = 1234;
        int tempNum = srcNum3;
        int reverseNum = 0;
        int numDigitsSum = 0;
        System.out.print("Исходное число в обратном порядке ");
        while(tempNum >= 1) {
            reverseNum = tempNum % 10;
            tempNum /= 10;
            numDigitsSum += reverseNum;
            System.out.print(reverseNum);
        }
        System.out.println(", cумма его цифр равна " + numDigitsSum + ".");

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк:");
        for(int i = 1; i <= 24; i += 2) {
            for(int j = 0; j < 5; j++) {
                if(i <= 24) {
                System.out.printf("%-3d", i);
                    if(j != 4) {
                        i += 2;
                    }
                } else {
                System.out.printf("%-3d", 0);
                }
            }
            System.out.println();
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n5. Проверка количества единиц на четность:");
        int srcNum5 = 3141591;
        int tempNum5 = srcNum5;
        int oneDigitQTY = 0;
        while (tempNum5 > 0) {
            if (tempNum5 % 10 == 1) {
                oneDigitQTY++;
            }
        tempNum5 = tempNum5 / 10;
        }
        System.out.print("Количество единиц в числе равно " + oneDigitQTY);
        if(oneDigitQTY % 2 == 0) {
            System.out.println(", результат является четным.");
        } else {
            System.out.println(", результат не является четным.");
        }

        //6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли:");
        for(int i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        int i6 = 0;
        int j6 = 0;
        while(i6 < 5) {
            while(j6 < 5) {
                System.out.print("#");
                j6++;
            }
        System.out.println();
        i6++;
        j6 = i6;
        }
        System.out.println();

        i6 = 0;
        j6 = 0;
        int k6 = 1;
        do {
            do {
                System.out.print("$");
                j6++;
            } while(j6 < k6);
            System.out.println();
            j6 = 0;
            i6++;
            if (i6 < 3) {
                k6++;
            } else {
                k6--;
            }
        } while(i6 < 5);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов:");
        System.out.printf("%1s%6s\n", "Dec", "Char");
        for(int i = 1; i < 48; i += 2) {
            System.out.printf("%3d%6c\n", i, i);
        }

        for(int i = 98; i < 123; i += 2) {
            System.out.printf("%3d%6c\n", i, i);
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом:");
        int srcNum8 = 1234321;
        String srcNumString = srcNum8 + "";
        boolean srcNumIsPalindrome = false;
        for(int i = 0; i < srcNumString.length() / 2; i++) {
            if(srcNumString.charAt(i) == srcNumString.charAt((srcNumString.length() - 1) - i)) {
                srcNumIsPalindrome = true;
            } else {
                srcNumIsPalindrome = false;
                i = srcNumString.length() / 2;
            }
        }
        if (srcNumIsPalindrome) {
            System.out.println("Число " + srcNumString + " является палиндромом");
        } else {
            System.out.println("Число " + srcNumString + " не является палиндромом");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым:");
        int srcNum_9 = 235191;
        int threeDigitsSum1 = 0;
        int threeDigitsSum2 = 0;
        int currentDigit = 0;
        System.out.print("Сумма превой тройки чисел ");
        for(int i = 100000; i > 100; i /= 10) {
            if(i == 100000) {
                currentDigit = srcNum_9 / i;
            } else {
                currentDigit = srcNum_9 / i % 10;
            }
            threeDigitsSum1 += currentDigit;
            System.out.print(currentDigit);
        }

        System.out.println(" = " + threeDigitsSum1);
        System.out.print("Сумма второй тройки чисел ");
        for(int i = 100; i > 0; i /= 10) {
            currentDigit = srcNum_9 / i % 10;
            threeDigitsSum2 += currentDigit;
            System.out.print(currentDigit);
        }

        System.out.println(" = " + threeDigitsSum2);
        if(threeDigitsSum1 == threeDigitsSum2) {
            System.out.println("Заданное число является счастливым.");
        } else {
            System.out.println("Заданное число не является счастливым.");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора:");
        for(int i = 0; i <= 9; i++) {
            if(i > 1) {
                System.out.print(" " + i + " |");                   //начало осталных строк
            } else if(i == 0) {
                System.out.print("   |");                           //начало 1й строки
            } else {
                System.out.print("___|__________________________"); // 2я строка
            }
            for(int j = 2; j <= 9; j++) {
                if(i > 1) {
                    System.out.printf("%3d", j * i);                // заполнение остальных строк
                } else if (i == 0) {
                    System.out.printf("%3d", j);                    // заполнение 1й строки
                }
            }
            if(i > 0) {
                System.out.println("\n   |");
            } else {
                System.out.println();
            }
        }
    }
}