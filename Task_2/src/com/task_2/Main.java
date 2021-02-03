package com.task_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        MyCalendar myCalendar = new MyCalendar(year, month);

        System.out.println("In the year " + year + ", in the " + month + "th month " +
                myCalendar.calculateDaysInMonth() + " days");

        System.out.println("Is leap year? - " + myCalendar.isLeapYear());
    }
}
