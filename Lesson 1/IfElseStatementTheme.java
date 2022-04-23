class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 20;
        if(age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше либо равен 20");
        }

        boolean mailGender = false;
        if(!mailGender) {
            System.out.println("Пол не мужской");
        }

        double height = 2.2;
        if(height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост больше либо равен 1.80");
        }

        char firstNameLetter = "Dmitry".charAt(0);
        if(firstNameLetter == 'M') {
            System.out.println("Имя начинается с буквы M");
        } else if(firstNameLetter == 'I') {
            System.out.println("Имя начинается с буквы I");
        } else {
            System.out.println("Имя начинается с другой буквы");
        }
        System.out.println();

        //2. Поиск максимального и минимального числа
        System.out.println("2. Поиск максимального и минимального числа");
        int x = 14;
        int y = 123;
        if(x > y) {
            System.out.println(x + " - максимальное число, " + y + " - минимальное число");
        } else {
            System.out.println(y + " - максимальное число, " + x + " - минимальное число");
        }
        System.out.println();

        //3. Работа с числом
        System.out.println("3. Работа с числом");
        int n = 1234;
        if(n % 2 == 0) {
            System.out.println(n + " - четное число");
        } else {
            System.out.println(n + " - нечетное число");
        }

        if(n < 0) {
            System.out.println(n + " - отрицательное число");
        } else {
            System.out.println(n + " - положительное число");
        }

        if (n == 0) {
            System.out.println(n + " - равно нулю");
        } else {
            System.out.println(n + " - не равно нулю");
        }
        System.out.println();

        //4. Поиск одинаковых цифр в числах
        System.out.println("4. Поиск одинаковых цифр в числах");
        int x1 = 234;
        int x2 = 544;
        if(x1 / 100 == x2 / 100) {
            System.out.println("В числе " + x1 + " и " + x2 + " одинаковые числа в 1м разряде.");
        } else if(x1 / 10 % 10 == x2 / 10 % 10) {
            System.out.println("В числе " + x1 + " и " + x2 + " одинаковые числа во 2м разряде.");
        } else if(x1 % 10 == x2 % 10) {
            System.out.println("В числе " + x1 + " и " + x2 + " одинаковые числа в 3м разряде.");
        }
        System.out.println();

        //5. Определение буквы, числа или символа по их коду
        System.out.println("5. Определение буквы, числа или символа по их коду");
        char c = '\u0057';
        if(c >= 48 && c <= 57) {
            System.out.println(c + " это число");
        } else if(c >= 65 && c <= 90) {
            System.out.println(c + " это большая буква");
        } else if(c >= 97 && c <= 122) {
            System.out.println(c + " это маленькая буква");
        } else {
            System.out.println(c + "это не буква и не число");
        }
        System.out.println();

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        double discount;
        double total;
        if(deposit < 100000) {
            discount = 0.05 * deposit;
            total = discount + deposit;
            System.out.println("Сумма вклада = " + deposit + ", начисленный % = " + discount + ", всего = " + total);
        } else if(deposit >= 100000 || deposit <= 300000) {
            discount = 0.07 * deposit;
            total = discount + deposit;
            System.out.println("Сумма вклада = " + deposit + ", начисленный % = " + discount + ", всего = " + total);
        } else if(deposit > 300000) {
            discount = 0.1 * deposit;
            total = discount + deposit;
            System.out.println("Сумма вклада = " + deposit + ", начисленный % = " + discount + ", всего = " + total);
        }
        System.out.println();

        //7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам");
        double hystory = 0.59;
        double prog = 0.91;
        int hystRate = 0;
        int progRate = 0;

        if(hystory <= 0.6) {
            hystRate = 2;
        } else if(hystory > 0.6 || hystory <= 0.73) {
            hystRate = 3;
        } else if(hystory > 0.73 || hystory <= 0.91) {
            hystRate = 4;
        } else if(hystory > 0.91) {
            hystRate = 5;
        }

        if(prog <= 0.6) {
            progRate = 2;
        } else if(prog > 0.6 || prog <= 0.73) {
            progRate = 3;
        } else if(prog > 0.73 || prog <= 0.91) {
            progRate = 4;
        } else if(prog > 0.91) {
            progRate = 5;
        }
        System.out.println(hystRate + " история");
        System.out.println(progRate + " программирование ");
        System.out.println("средний балл оценок по предметам " + (hystRate + progRate)/2);
        System.out.println("средний % по предметам " + (hystory + prog)/2*100 + "%" );
        System.out.println();

        //8. Расчет прибыли
        System.out.println("8. Расчет прибыли");
        int rentRate = 5000;
        int sellRate = 15000;
        int goodsCost = 9000;
        int yearProfit = sellRate * 12 - goodsCost * 12 - rentRate * 12;
        System.out.println("прибыль за год " + yearProfit);
        System.out.println();

        //9. Определение существования треугольника
        System.out.println("9. Определение существования треугольника");
        int n1 = 3;
        int n2 = 4;
        int n3 = 5;
        int g = 0;
        int k1 = 0; 
        int k2 = 0;
        boolean triangleIsExist = false;
        
        if(n1 > 0 && n2 > 0 && n3 > 0) {
            if(n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) {
                triangleIsExist = true;
            }
        }

        if(triangleIsExist) {
            if(n1 > n2 && n1 > n3) {
                g = n1;
                k1 = n2;
                k2 = n3;
            } else if(n2 > n3 && n2 > n1) {
                g = n2;
                k1 = n1;
                k2 = n3;
            } else if(n3 > n1 && n3 > n2) {
                g = n3;
                k1 = n1;
                k2 = n2;
            }
            
            int square = k1 * k2 / 2;
            
            //Рисуем треугольник
            System.out.println("|\\");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|___\\");
            System.out.println("\nКатеты треугольника равны " + k1 + " и " + k2 + ", гипотенуза равна " + g + ".");
            System.out.println("\nПлощадь треугольника равна " + square + ".");
            System.out.println();
        }

        //10. Подсчет количества банкнот
        System.out.println("10. Подсчет количества банкнот");
        int sum = 567;
        int b1 = 50;
        int b2 = 10;
        int b3 = 1;
        int b1count = sum / 50;
        int b2count = sum % 50 / 10;
        int b3count = sum % 10;
        int allCount = b1count * 50 + b2count * 10 + b3count;
        System.out.println("Номинала банкнот" + b1 + " требуется " + b1count + " шт.");
        System.out.println("Номинала банкнот" + b2 + " требуется " + b2count + " шт.");
        System.out.println("Номинала банкнот" + b3 + " требуется " + b3count + " шт.");
        System.out.println("Сумма всех бонктон равна " + allCount + ".");
        Syste.out.println();
    }
}