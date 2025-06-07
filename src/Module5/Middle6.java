package Module5;
import java.util.Random;
import java.util.Scanner;

public class Middle6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;
            int C = a * b;

            System.out.print("Пример " + i + ": Сколько будет " + a + " * " + b + "? ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == C) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Неправильно! Правильный ответ: " + C);
            }
        }
    }
}