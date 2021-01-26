package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int findingPositiveNumbers(List<Integer> sequence){
        int count = 0;
        for(int seq: sequence){
            if (seq % 2 == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;

        System.out.print("Enter A : ");
        A = scanner.nextInt();
        System.out.print("Enter B : ");
        B = scanner.nextInt();
        System.out.print("Enter C : ");
        C = scanner.nextInt();
        System.out.print("Enter D : ");
        D = scanner.nextInt();

        List<Integer> sequence = new ArrayList<>();
        sequence.add(A);
        sequence.add(B);
        sequence.add(C);
        sequence.add(D);

        if (findingPositiveNumbers(sequence) >= 2){
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
