package com.task_1;

import java.util.Scanner;

public class Main {
    static double calculateSquare(double numb){
        return Math.pow(numb, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number = scanner.nextInt();
        int lastDigit = number % 10;

        System.out.println("The last digit of number = " + lastDigit);
        System.out.println("Square of the last digit of number = " + calculateSquare(lastDigit) % 10 +
                "\nSquare of number = " + calculateSquare(number));
    }
}
