package com.task_6;

import java.util.Scanner;

public class Main {

    static String determineTime(int n){
        int hour = n/3600;
        n -= hour * 3600;
        int min = n / 60;
        n -= min * 60;
        int sec = n;

        String str = "In " + n + " seconds - " + hour + " hour " +
                min + " min " + sec + " sec";

        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int n = scanner.nextInt();

        System.out.println(determineTime(n));
    }
}
