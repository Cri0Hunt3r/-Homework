package Module4;

import java.util.Scanner;

public class Middle5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2+bx+c=0");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (((b * b) - (4 * a * c)) >= 0) {
            System.out.println("Есть действительные корни");
        } else {
            System.out.println("Нет действительных корней");
        }
    }
}