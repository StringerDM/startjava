package com.startjava.lesson_1.base;

class VariablesTheme {

    public static void main(String[] args) {
        //1. Создание переменных и вывод их значений на консоль
        System.out.println("\n1. Создание переменных и вывод их значений на консоль:");
        byte coreNum = 4;
        short cpuFreq = 2000;
        int power = 100500;
        long memory = 240570593280l;
        float floppyDisk = 3.14f;
        double monitor = 15.47583843d;
        char dir = 'C';
        boolean isPowerOn = true;
        System.out.println("Количество ядер = " + coreNum + ", частота процессора = " + cpuFreq + 
                ", мощь = " + power + ", память = " + memory + ", \nфлопик - " + floppyDisk + 
                ", монитор = " + monitor + " директория = " + dir + ", работает? = " + isPowerOn);

        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой:");
        int costX = 100;
        int costY = 200;
        int total = costX + costY;
        float discount = 0.11f * total;
        System.out.println("Сумма скидки = " + discount + ", общая сумма товаров со скидкой = " + (total - discount));

        //3. Вывод на консоль слова JAVA
        System.out.println("\n3. Вывод на консоль слова JAVA:");
        System.out.println("   J    a  v     v  a    \n   J   a a  v   v  a a   \nJ  JJ aaaaa  V V  aaaaa  \n JJ  a     a  V  a     a ");

        //4. Отображение min и max значений числовых типов данных
        System.out.println("\n4. Отображение min и max значений числовых типов данных:");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;
        System.out.println(byteMax + ", " + shortMax  + ", " +  intMax  + ", " +  longMax);
        System.out.println(++byteMax + ", " + ++shortMax  + ", " +  ++intMax  + ", " +  ++longMax);
        System.out.println(--byteMax + ", " + --shortMax  + ", " +  --intMax  + ", " +  --longMax);

        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных:");
        float f  = 3.5f;
        double d = 8.34d;
        System.out.println(f  + ", " +  d);
        double temp = f;
        f = (float) d;
        d = (double) temp;
        System.out.println(f  + ", " +  d);

        //6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов:");
        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;
        System.out.println(codeChar1 + " -> " + (char) codeChar1 + ", " + codeChar2 + " -> " + (char) codeChar2 + ", "
                 + codeChar3 + " -> " + (char) codeChar3 + ", " + codeChar4 + " -> " + (char) codeChar4 + ", " 
                 + codeChar5 + " -> " + (char) codeChar5);

        //7. Произведение и сумма цифр числа
        System.out.println("\n7. Произведение и сумма цифр числа:");
        int srcNum = 345;
        int digit1 = srcNum / 100;
        int digit2 = srcNum / 10 % 10;
        int digit3 = srcNum % 10;
        int productDigits = digit1 * digit2 * digit3;
        int sumDigits = digit1 + digit2 + digit3;
        System.out.println("Произведение цифр " + srcNum + " = " + productDigits + ", cумма цифр " + srcNum + " = " + sumDigits);

        //8. Вывод на консоль ASCII-арт Дюка
        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка:");
        char sp = ' ';
        char s1 = '/';
        char s2 = '\\';
        char us = '_';
        char b1 = '(';
        char b2 = ')';
        System.out.println("" + sp + sp + sp + sp + s1 + s2 + sp + sp + sp + sp + sp + sp);
        System.out.println("" + sp + sp + sp + s1 + sp + sp + s2 + sp + sp + sp + sp + sp);
        System.out.println("" + sp + sp + s1 + us + b1 + sp + b2 + s2 + sp + sp + sp + sp);
        System.out.println("" + sp + s1 + sp + sp + sp + sp + sp + sp + s2 + sp + sp + sp);
        System.out.println("" + s1 + us + us + us + us + s1 + s2 + us + us + s2 + sp + sp);

        //9. Отображение количества сотен, десятков и единиц числа
        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа:");
        int srcNum9 = 123;
        int h = srcNum9 / 100;
        int t = srcNum9 / 10 % 10;
        int o = srcNum9 % 10;
        System.out.println("Сотен в числе 123 = " + h);
        System.out.println("Десятков в числе 123 = " + t);
        System.out.println("Единиц в числе 123 = " + o);

        //10. Преобразование секунд
        System.out.println("\n10. Преобразование секунд");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int remSeconds = totalSeconds % 3600;
        int mm = remSeconds / 60;
        int ss = remSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}