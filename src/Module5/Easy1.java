package Module5;
import java.util.Scanner;
public class Easy1 {
    public static void main(String[] args) {
        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextInt();
        int n = scanner.nextInt();
        double result = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            result *= number;
        }
        if (n < 0) {
            result = 1/result;
        } System.out.println(result);
    }
}