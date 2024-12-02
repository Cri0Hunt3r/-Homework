package com.nikolaev;

import java.util.Scanner;

public class Easy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        double z = scanner.nextInt();
        double sum = z + y + x;
        double proz = z * y * x;
        System.out.println("Сумма этих значений:" + sum + ", а произведение:" + proz);
    }}
