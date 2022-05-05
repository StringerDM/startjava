import java.util.Scanner;

public class Calculator {

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите знак математической операции:");
        char sign = scanner.next().charAt(0);
        System.out.println("Введите второе число:");
        int b =  scanner.nextInt();;
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
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}