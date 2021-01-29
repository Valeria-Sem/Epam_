package com.task_5;

import java.util.Scanner;

public class Main {
    static boolean sum(int n) {
        int summa = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0)
                summa += i;
        }
        return summa == n;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(sum(a)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
