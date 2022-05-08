package com.startjava.lesson_1.base;

class CyclesTheme {

    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел:");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else sumOdd += counter;
            counter++;
        } while(counter <= 21);
        System.out.println("Сумма четных чисел равна " + sumEven);
        System.out.println("сумма нечетных чисел равна " + sumOdd);

        //2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min:");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num3;
        int minNum = num1;
        if(num1 >= num2 && num1 >= num3) {
            maxNum = num1;
            if(num2 > num3) {
                minNum = num3;
            } else {
                minNum = num2;
            }
        } else if(num2 >= num3 && num2 >= num1) {
            maxNum = num2;
            if (num1 >= num3) {
                minNum = num3;
            }
        } else if(num1 >= num2) {
            minNum = num2;
        } 
        System.out.println("Числа в диапазоне от " + maxNum + " до " + minNum +": ");
        for(int i = maxNum; i > minNum; i--) {
            System.out.print(i + ", ");
        }
        System.out.println(minNum + ".");

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр:");
        int srcNum = 1234;
        int reverseNum = 0;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке ");
        while(srcNum >= 1) {
            reverseNum = srcNum % 10;
            srcNum /= 10;
            sumDigits += reverseNum;
            System.out.print(reverseNum);
        }
        System.out.println(", cумма его цифр равна " + sumDigits + ".");

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк:");
        int count = 0;
        for(int i = 1; i < 24; i += 2) {
            if(count == 5) {
                System.out.println();
                count = 0;
            }
            System.out.printf("%3d", i);
            count++;
        }
        for(int i = count; i < 5; i++) {
            System.out.printf("%3d", 0);
        }
        System.out.println();

        //5. Проверка количества единиц на четность
        System.out.println("\n5. Проверка количества единиц на четность:");
        srcNum = 3141591;
        int countUnits = 0;
        while (srcNum > 0) {
            if (srcNum % 10 == 1) {
                countUnits++;
            }
            srcNum /= 10; 
        }
        System.out.print("Количество единиц в числе равно " + countUnits);
        if(countUnits % 2 == 0) {
            System.out.println(", результат является четным.");
        } else {
            System.out.println(", результат является нечетным.");
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
        System.out.printf("%s%6s\n", "Dec", "Char");
        for(int i = 1; i < 48; i += 2) {
            System.out.printf("%3d%6c\n", i, i);
        }

        for(int i = 98; i < 123; i += 2) {
            System.out.printf("%3d%6c\n", i, i);
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом:");
        srcNum = 1234321;
        String srcNumString = srcNum + "";
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
        srcNum = 235191;
        int threeDigitsSum1 = 0;
        int threeDigitsSum2 = 0;
        int currentDigit = 0;
        System.out.print("Сумма превой тройки чисел ");
        for(int i = 100000; i > 100; i /= 10) {
            if(i == 100000) {
                currentDigit = srcNum / i;
            } else {
                currentDigit = srcNum / i % 10;
            }
            threeDigitsSum1 += currentDigit;
            System.out.print(currentDigit);
        }

        System.out.println(" = " + threeDigitsSum1);
        System.out.print("Сумма второй тройки чисел ");
        for(int i = 100; i > 0; i /= 10) {
            currentDigit = srcNum / i % 10;
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
        //начало 1й строки
        System.out.print("   |");
        // заполнение 1й строки
        for(int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        // 2я строка
        System.out.print("\n___|________________________"); 
        for(int i = 2; i <= 9; i++) {
            System.out.println("\n   |");
            //начало остальных строк
            System.out.print(" " + i + " |");                   
            for(int j = 2; j <= 9; j++) {
                // заполнение остальных строк
                System.out.printf("%3d", j * i);                
            }
        }
    }
}