package com.task_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        Function f = new Function(x);
        System.out.println(f.calculateFunction());
    }
}
