package Module6.Middle1;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введите действие: ");
        String method = scanner.next();
        System.out.print("Введите первый аргумент: ");
        int arg1 = scanner.nextInt();
        System.out.print("Введите второй аргумент: ");
        int arg2 = scanner.nextInt();

        if (Objects.equals(method, "+")) {
            System.out.println(calculator.sum(arg1, arg2));
        } else if(Objects.equals(method, "-")){
            System.out.println(calculator.diff(arg1, arg2));
        } else if(Objects.equals(method, "*")){
            System.out.println(calculator.prod(arg1, arg2));
        } else if(Objects.equals(method, "/")){
            System.out.println(calculator.quot(arg1, arg2));
        }
    }
}



class Calculator {
    public int sum(int a, int b) {
        return a + b;
    } public int diff(int a, int b) {
        return a - b;
    } public int prod(int a, int b) {
        return a * b;
    } public float quot(int a, int b) {
        return (float) a / b;
    }
}
