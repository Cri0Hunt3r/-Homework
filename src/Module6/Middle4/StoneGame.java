package Module6.Middle4;

import java.util.Random;
import java.util.Scanner;

public class StoneGame {
    Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    private int counter;
    private static int computer;
    private boolean tumbler = true;
    public StoneGame(int computerNumber, Player player) {
        System.out.println("Сейчас ходит первый игрок");
        while (true) {
            counter += scanner.nextInt();
            if (tumbler && counter >= computerNumber) {
                player.playerTwo();
                System.out.println("Компьютер задумал число " + computer);
                System.out.println("Игрок 2 победил");
                break;
            } else if (!tumbler && counter >= computerNumber)     {
                player.playerOne();
                System.out.println("Компьютер задумал число " + computer);
                System.out.println("Игрок 1 победил");
                break;
            } else {
                if (!tumbler) {
                    tumbler = true;
                    System.out.println("Сейчас ходит первый игрок:");
                } else {
                    tumbler = false;
                    System.out.println("Сейчас ходит второй игрок:");
                }
            }
            System.out.println("Суммарно " + counter);
        }
    }
    public static int computerNumber() {
        computer = random.nextInt(100 - 1 + 1) + 1;
        return computer;
    }
}