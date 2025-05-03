package Module5;
import java.util.Scanner;
public class Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 2; i < N; i++ ){
            if (N % i == 0){
                System.out.println(i);
            }
        }
    }
}