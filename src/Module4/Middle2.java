package Module4;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ost = a % b;
        if (ost == 0) {
            System.out.println("число 1 кратно числу 2");
        } else {
            System.out.println("Число 1 не кратно числу 2");
            System.out.println("Остаток:" + ost);
        }
    }
}