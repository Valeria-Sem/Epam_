package com.company;

import java.util.Scanner;

public class Main {
    static double calculateSquare (double numb){
        return Math.pow(numb, 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int last_number = number%10;
        System.out.println("The last number - " + last_number);
        System.out.println("Square of the last number = " + calculateSquare(last_number) % 10 +
                "\nSquare of number = " + calculateSquare(number));
    }
}
