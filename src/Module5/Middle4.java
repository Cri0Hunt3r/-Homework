package Module5;
import java.util.Scanner;
public class Middle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int number = 1;
        for (int i = 2; i <= N; i++ ){
            number *= i;}
        System.out.println(number);
    }
}