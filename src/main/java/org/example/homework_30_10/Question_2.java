package org.example.homework_30_10;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        //Write a Java function to print first 100 numbers in Fibonacci series?

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Fibonacci series :  ");
        int n = scanner.nextInt();

        int n1 = 0, n2 = 1;
        int n3 = n1 + n2;
        System.out.print(n1 + " " + n2);

        for (int i = 0; i <= n; i++) {

            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.print(" " + n3);
        }
    }
}
