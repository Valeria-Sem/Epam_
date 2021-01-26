package com.task_9;

import java.util.Scanner;

public class Main {

    static double calculateArea(double radius){
       return Math.PI * Math.pow(radius, 2);
    }

    static double calculateLengthOfCircle(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("The area of a circle" + calculateArea(radius));
        System.out.println("The length of a circle" + calculateLengthOfCircle(radius));
    }
}
