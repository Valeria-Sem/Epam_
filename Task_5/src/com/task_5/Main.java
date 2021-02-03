package com.task_5;

import java.util.Scanner;

public class Main {

    static boolean isPerfectNumber(int numb) {
        int summa = 0;

        for(int i = 1; i < numb; i++) {
            if(numb % i == 0)
                summa += i;
        }

        return summa == numb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(isPerfectNumber(number));
    }
}
