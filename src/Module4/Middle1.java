package Module4;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a > b) & (a > c) & (b > c)) {
            System.out.println("min:" + c);
            System.out.println("max:" + a);
            System.out.println("mid:" + b);
        } else if ((a > b) & (a > c) & (c > b)) {
            System.out.println("min:" + b);
            System.out.println("max:" + a);
            System.out.println("mid:" + c);
        } else if ((b > a) & (b > c) & (a > c)) {
            System.out.println("min:" + c);
            System.out.println("max:" + b);
            System.out.println("mid:" + a);
        } else if ((b > a) & (b > c) & (c > a)) {
            System.out.println("min:" + a);
            System.out.println("max:" + b);
            System.out.println("mid:" + c);
        } else if ((c > a) & (c > b) & (a > b)) {
            System.out.println("min:" + b);
            System.out.println("max:" + c);
            System.out.println("mid:" + a);
        } else if ((c > a) & (c > b) & (b > a)) {
            System.out.println("min:" + a);
            System.out.println("max:" + c);
            System.out.println("mid:" + b);
        }
    }
}