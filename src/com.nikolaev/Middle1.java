package com.nikolaev;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        double money = scanner.nextDouble();
        double zarplata = days * money;
        System.out.println("Зарплата = " + zarplata);
    }
}
