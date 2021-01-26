package com.company;

import java.util.Scanner;

public class Main {
    final static double Pi = 3.14;

    static double calculateArea(double radius){
       return Pi * Math.pow(radius, 2);
    }

    static double calculateLengthOfCircle(double radius){
        return 2 * Pi * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("The area of a circle" + calculateArea(radius));
        System.out.println("The length of a circle" + calculateLengthOfCircle(radius));
    }
}
