package com.task_6;

import java.util.Scanner;

public class Main {
    static int sec, min, hour;

    static void determiningTime(int n){
        hour = n/3600;
        n -= hour * 3600;
        min = n / 60;
        n -= min * 60;
        sec = n;
    }

    public static void main(String[] args) {
	    int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        n = scanner.nextInt();

        determiningTime(n);
        System.out.println("In " + n + " seconds - " + hour + " hour " +
                min + " min " + sec + " sec");

    }
}
