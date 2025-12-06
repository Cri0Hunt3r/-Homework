package Module6.Middle1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите действие: ");
        String method = scanner.next();
        System.out.print("Введите первый аргумент: ");
        int arg1 = scanner.nextInt();
        System.out.print("Введите второй аргумент: ");
        int arg2 = scanner.nextInt();

        switch (method) {
            case "+" :
                System.out.println(Calculator.sum(arg1, arg2));
                break;
            case "-" :
                System.out.println(Calculator.diff(arg1, arg2));
                break;
            case "*" :
                System.out.println(Calculator.prod(arg1, arg2));
                break;
            case "/" :
                System.out.println(Calculator.quot(arg1, arg2));
                break;
            default:
                System.out.println("Вы ввели недопустимый символ. Можно вводить только: + - * /");
                break;
        }
    }
}



class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    } public static int diff(int a, int b) {
        return a - b;
    } public static int prod(int a, int b) {
        return a * b;
    } public static float quot(int a, int b) {
        return (float) a / b;
    }
}
