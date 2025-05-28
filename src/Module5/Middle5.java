package Module5;
import java.util.Scanner;

public class Middle5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы N (от 1 до 10): ");
        int N = scanner.nextInt();
        if (N < 1 || N > 10) {
            System.out.println("Ошибка: N должно быть от 1 до 10.");
            return;
        }
        int[][] matrix = new int[N][N];
        System.out.println("Введите элементы матрицы построчно:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Сумма элементов главной диагонали: " + sum);
    }
}