class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java:");
        int age = 20;
        if(age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше либо равен 20");
        }

        boolean isMailGender = false;
        if(!isMailGender) {
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

        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа:");
        int a = 14;
        int b = 123;
        if(a > b) {
            System.out.println(a + " - максимальное число, " + b + " - минимальное число");
        } else {
            System.out.println(b + " - максимальное число, " + a + " - минимальное число");
        }

        //3. Работа с числом
        System.out.println("\n3. Работа с числом:");
        int n = 1234;
        if(n % 2 == 0) {
            System.out.println(n + " - четное число");
        } else {
            System.out.println(n + " - нечетное число");
        }

        if(n < 0) {
            System.out.println(n + " - отрицательное число");
        } else if (n > 0) {
            System.out.println(n + " - положительное число");
        } 

        if (n == 0) {
            System.out.println(n + " - равно нулю");
        } else {
            System.out.println(n + " - не равно нулю");
        }

        //4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах:");
        int srcNum1 = 434;
        int srcNum2 = 444;
        int digitNum1_1 = srcNum1 / 100;
        int digitNum1_2 = srcNum1 / 10 % 10;
        int digitNum1_3 = srcNum1 % 10;
        int digitNum2_1 = srcNum2 / 100;
        int digitNum2_2 = srcNum2 / 10 % 10;
        int digitNum2_3 = srcNum2 % 10;
        if(digitNum1_1 == digitNum2_1) {
            System.out.println("В числе " + srcNum1 + " и " + srcNum2 + " одинаковое число " + digitNum1_1 + " в 1м разряде.");
        } 

        if(digitNum1_2 == digitNum2_2) {
            System.out.println("В числе " + srcNum1 + " и " + srcNum2 + " одинаковое число " + digitNum1_2 + " во 2м разряде.");
        } 

        if(digitNum1_3 == digitNum2_3) {
            System.out.println("В числе " + srcNum1 + " и " + srcNum2 + " одинаковое число " + digitNum1_3 + " в 3м разряде.");
        }

        //5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду:");
        char code = '\u0057';
        if(code >= 48 && code <= 57) {
            System.out.println(code + " это число");
        } else if(code >= 65 && code <= 90) {
            System.out.println(code + " это большая буква");
        } else if(code >= 97 && code <= 122) {
            System.out.println(code + " это маленькая буква");
        } else {
            System.out.println(code + "это не буква и не число");
        }

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %.");
        int depositAmount = 300000;
        double accruedInterst = 0;
        int totalDepositAmount;
        if(depositAmount < 100000) {
            accruedInterst = 0.05 * depositAmount;
        } else if(depositAmount >= 100000 || depositAmount <= 300000) {
            accruedInterst = 0.07 * depositAmount;
        } else if(depositAmount > 300000) {
            accruedInterst = 0.1 * depositAmount;
        }

        totalDepositAmount = depositAmount + (int) accruedInterst;
        System.out.println("Сумма вклада = " + depositAmount + ", начисленный % = " + (int) accruedInterst + ", всего = " + totalDepositAmount);

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам:");
        int histPercentGrade = 59;
        int progPercentGrade = 91;
        int hystGrade = 0;
        int progGrade = 0;

        if(histPercentGrade <= 60) {
            hystGrade = 2;
        } else if(histPercentGrade > 60 && histPercentGrade <= 73) {
            hystGrade = 3;
        } else if(histPercentGrade > 73 && histPercentGrade <= 91) {
            hystGrade = 4;
        } else if(histPercentGrade > 91) {
            hystGrade = 5;
        }

        if(progPercentGrade <= 60) {
            progGrade = 2;
        } else if(progPercentGrade > 60 && progPercentGrade <= 73) {
            progGrade = 3;
        } else if(progPercentGrade > 73 && progPercentGrade <= 91) {
            progGrade = 4;
        } else if(progPercentGrade > 91) {
            progGrade = 5;
        }
        int gradesAverage = (hystGrade + progGrade) / 2;
        int percentGradesAverage = (histPercentGrade + progPercentGrade) / 2;
        System.out.println(hystGrade + " история");
        System.out.println(progGrade + " программирование ");
        System.out.println("средний балл оценок по предметам " + gradesAverage);
        System.out.println("средний процент по предметам " + percentGradesAverage + "%" );

        //8. Расчет прибыли
        System.out.println("\n8. Расчет прибыли:");
        int rentRate = 5000;
        int sellAmount = 15000;
        int goodsCost = 9000;
        int yearProfit = sellAmount * 12 - goodsCost * 12 - rentRate * 12;
        if (yearProfit >= 0) {
            System.out.println("прибыль за год: " + " +" + yearProfit + "р");
        } else {
            System.out.println("прибыль за год: " + " -" + yearProfit + "р");
        }

        //9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника:");
        int triangleSide1 = 3;
        int triangleSide2 = 4;
        int triangleSide3 = 5;
        int hypotenuse = 0;
        int cathet1 = 0; 
        int cathet2 = 0;
        boolean triangleIsExist = false;
        if(triangleSide1 > 0 && triangleSide2 > 0 && triangleSide3 > 0) {
            if(triangleSide1 + triangleSide2 > triangleSide3 && triangleSide1 + triangleSide3 > triangleSide2 
                    && triangleSide2 + triangleSide3 > triangleSide1) {
                triangleIsExist = true;
            }
        }

        if(triangleIsExist) {
            if(triangleSide1 > triangleSide2 && triangleSide1 > triangleSide3) {
                hypotenuse = triangleSide1;
                cathet1 = triangleSide2;
                cathet2 = triangleSide3;
            } else if(triangleSide2 > triangleSide3 && triangleSide2 > triangleSide1) {
                hypotenuse = triangleSide2;
                cathet1 = triangleSide1;
                cathet2 = triangleSide3;
            } else if(triangleSide3 > triangleSide1 && triangleSide3 > triangleSide2) {
                hypotenuse = triangleSide3;
                cathet1 = triangleSide1;
                cathet2 = triangleSide2;
            }
            
            int triangleSquare = cathet1 * cathet2 / 2;
            System.out.println("|\\");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|___\\");
            System.out.println("Катеты треугольника равны " + cathet1 + " и " + cathet2 + ", гипотенуза равна " + hypotenuse + ".");
            System.out.println("Площадь треугольника равна " + triangleSquare + ".");
        } else {
            System.out.println("Треугольник не существует");
        }

        //10. Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот:");
        int sum = 567;
        int b1 = 50;
        int b2 = 10;
        int b3 = 1;
        int b1Сount = sum / b1;
        int b2Сount = sum % b1 / b2;
        int b3Сount = sum % b1 % b2 / b3;
        int allCount = b1Сount * b1 + b2Сount * b2 + b3Сount * b3;
        System.out.println("Номинала банкнот " + b1 + " требуется " + b1Сount + " шт.");
        System.out.println("Номинала банкнот " + b2 + " требуется " + b2Сount + " шт.");
        System.out.println("Номинала банкнот " + b3 + " требуется " + b3Сount + " шт.");
        System.out.println("Сумма всех банкнот равна " + allCount + ".");
    }
}