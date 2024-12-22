package Module3;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int Diss = (b * b) - (4 * a * c);
        System.out.println(Diss);
    }}
