package com.task_3;

public class Main {

    public static void main(String[] args) {
        double square;
        double squareSide;
        double radius;
        double square2;
        double x;

        square = 819;
        squareSide = Math.sqrt(square);
        radius = squareSide/2;
        square2 = 0.5 * Math.pow(radius, 2) * 4;
        x = square/square2;
        System.out.println(x);

    }
}
