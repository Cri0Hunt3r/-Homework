package Module6.Middle4;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        for (int i = 0; i < 3; i++) {
            System.out.println("=== Игра " + (i + 1) + " ===");
            new StoneGame(StoneGame.computerNumber(), player);
        }

        player.winner();
    }
}

