package Module4;

import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x > 0) {
            y = 2 * x;
        } else {
            y = -2 * x;
        }
        System.out.println(y);
    }
}
