package Module4;

import java.util.Scanner;

public class Easy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo = scanner.nextInt();
        if (chislo == 1) {
            System.out.println("Зима");
        } else if (chislo == 2) {
            System.out.println("Весна");
        } else if (chislo == 3) {
            System.out.println("Лето");
        } else if (chislo == 4) {
            System.out.println("Осень");
        } else {
            System.out.println("Вы ввели неправильное число");
        }

    }
}