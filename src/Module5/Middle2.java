package Module5;
import java.util.Scanner;
public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++ ){
            double number = scanner.nextDouble();
            array[i] = number;
        }
        if (array.length == 0) {
            System.out.println("Массив пуст");
            return;
        }
        double maxAbs = Math.abs(array[0]);
        for (int i = 1; i < array.length; i++) {
            double currentAbs = Math.abs(array[i]);
            maxAbs = Math.max(maxAbs, currentAbs);
        }

        System.out.println("Максимальный по модулю элемент: " + maxAbs);
    }
}