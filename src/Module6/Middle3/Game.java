package Module6.Middle3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Game(int sticks) {
        int playerNumber;
        while (sticks != 0){
            playerNumber = scanner.nextInt();
            if (playerNumber > 3 || playerNumber < 1) {
                System.out.println("Вы можете называть только числа: 1 2 3");
                break;
            }
            sticks -= playerNumber;
            int computerNumber = getNumber(sticks);
            sticks -= computerNumber;
            if (computerNumber == -1) {
                System.out.println("Вы проиграли");
                break;
            } else if (computerNumber == 0) {
                System.out.println("Вы победили");
                break;
            }
            System.out.println("Компьютер выбрал число " + computerNumber);
            System.out.print("Оставшееся число палочек:");
            for (int i = 0; i < sticks; i++) {
                System.out.print("|");
            } System.out.println(" ");
        }
    }

    private int getNumber(int sticks) {
        if (sticks > 3) {
            return random.nextInt(3 - 1 + 1) + 1;
        } else if (sticks == 3) {
            return random.nextInt(2 - 1 + 1) + 1;
        } else if (sticks == 2) {
            return 1;
        } else if (sticks == 1) {
            return 0;
        }
        return -1;
    }
}

