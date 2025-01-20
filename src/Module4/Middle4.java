package Module4;

import java.util.Objects;
import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        if ((Objects.equals(a, "яйцо")) || (Objects.equals(b, "яйцо")) || (Objects.equals(c, "яйцо"))) {
            System.out.println("яичницу");
        } if (((Objects.equals(a, "яйцо")) || (Objects.equals(b, "яйцо")) || (Objects.equals(c, "яйцо"))) & ((Objects.equals(a, "молоко")) || (Objects.equals(b, "молоко")) || (Objects.equals(c, "молоко")))) {
            System.out.println("омлет");
        } if (((Objects.equals(a, "кофе")) || (Objects.equals(b, "кофе")) || (Objects.equals(c, "кофе"))) & ((Objects.equals(a, "молоко")) || (Objects.equals(b, "молоко")) || (Objects.equals(c, "молоко")))) {
            System.out.println("кофе");
        }
    }
}