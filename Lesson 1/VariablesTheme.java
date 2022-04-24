class VariablesTheme {

    public static void main(String[] args) {
        //1. Создание переменных и вывод их значений на консоль
        System.out.println();
        System.out.println("1. Создание переменных и вывод их значений на консоль:");
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
        System.out.println();

        //2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой:");
        int costX = 100;
        int costY = 200;
        int total = costX + costY;
        float discount = 0.11f * total;
        System.out.println("Сумма скидки = " + discount + ", общая сумма товаров со скидкой = " + (total - discount));
        System.out.println();

        //3. Вывод на консоль слова JAVA
        System.out.println("3. Вывод на консоль слова JAVA:");
        System.out.println("   J    a  v     v  a    \n   J   a a  v   v  a a   \nJ  JJ  aaaaa  V V  aaaaa \n JJ  a     a  V  a     a ");
        System.out.println();

        //4. Отображение min и max значений числовых типов данных
        System.out.println("4. Отображение min и max значений числовых типов данных:");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;
        System.out.println(byteMax + ", " + shortMax  + ", " +  intMax  + ", " +  longMax);
        System.out.println(++byteMax + ", " + ++shortMax  + ", " +  ++intMax  + ", " +  ++longMax);
        System.out.println(--byteMax + ", " + --shortMax  + ", " +  --intMax  + ", " +  --longMax);
        System.out.println();

        //5. Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных:");
        float f  = 3.5f;
        double d = 8.34d;
        System.out.println(f  + ", " +  d);
        double temp = f;
        f = (float) d;
        d = (double) temp;
        System.out.println(f  + ", " +  d);
        System.out.println();

        //6. Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов:");
        int x1 = 35;
        int x2 = 38;
        int x3 = 64;
        int x4 = 94;
        int x5 = 95;
        System.out.println(x1 + " -> " + (char) x1 + ", " + x2 + " -> " + (char) x2 + ", " + x3 + " -> "
                 + (char) x3 + ", " + x4 + " -> " + (char) x4 + ", " + x5 + " -> " + (char) x5 + ".");
        System.out.println();

        //7. Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа:");
        int num = 345;
        int n1 = num / 100;
        int n2 = num / 10 % 10;
        int n3 = num % 10;
        int muliply = n1 * n2 *n3;
        int sum = n1 + n2 + n3;
        System.out.println("Произведение цифр " + num + " = " + muliply + ", cумма цифр " + num + " = " + sum + ", ");
        System.out.println();

        //8. Вывод на консоль ASCII-арт Дюка
        System.out.println("8. Вывод на консоль ASCII-арт Дюка:");
        char sp = 32; // ' '
        char s1 = 47; // '/'
        char s2 = 92; // '\'
        char ld = 95; // '_'
        char b1 = 40; // '(''
        char b2 = 41; // ')'
        System.out.println("" + sp + sp + sp + sp + s1 + s2 + sp + sp + sp + sp + sp + sp);
        System.out.println("" + sp + sp + sp + s1 + sp + sp + s2 + sp + sp + sp + sp + sp);
        System.out.println("" + sp + sp + s1 + ld + b1 + sp + b2 + s2 + sp + sp + sp + sp);
        System.out.println("" + sp + s1 + sp + sp + sp + sp + sp + sp + s2 + sp + sp + sp);
        System.out.println("" + s1 + ld + ld + ld + ld + s1 + s2 + ld + ld + s2 + sp + sp);
        System.out.println();

        //9. Отображение количества сотен, десятков и единиц числа
        System.out.println("9. Отображение количества сотен, десятков и единиц числа:");
        int n = 123;
        int h = n / 100;
        int t = n / 10 % 10;
        int o = n % 10;
        System.out.println("Сотен в числе 123 = " + h + "; 123 / 100 = 1.23, .23 отбрасывается - переменная int хранит только целое цисло)");
        System.out.println("Десятков в числе 123 = " + t + "; 123 / 10 = 12.3, .3 отбрасывается, 12 % 10 (деление с остатком) - остаток от деления - 2");
        System.out.println("Единиц в числе 123 = " + o + "; 123 % 10 (деление с остатком) - остаток от деления - 3");
        System.out.println();

        //10. Преобразование секунд
        System.out.println("10. Преобразование секунд");
        int seconds = 86399;
        int hh = seconds / 3600;
        int seconds1 = seconds % 3600;
        int mm = seconds1 / 60;
        int ss = seconds1 % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
        System.out.println();
    }
}