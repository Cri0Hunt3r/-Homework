package Module4;

import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        if (a.equals("яйца") || b.equals("яйца") || c.equals("яйца")) {
            System.out.println("яичницу");
        } if ((a.equals("яйца") || b.equals("яйца") || c.equals("яйца")) & (a.equals("молоко") || b.equals("молоко") || c.equals("молоко"))) {
            System.out.println("омлет");
        } if ((a.equals("молоко") || b.equals("молоко") || c.equals("молоко")) & (a.equals("кофе") || b.equals("кофе") || c.equals("кофе"))) {
            System.out.println("кофе");
        }
    }
}