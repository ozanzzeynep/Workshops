package org.example.homework_30_10;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {

        //7-Write a Java program finds first 10 perfect numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        int n = 1;
        int perfectNumber = 0;

        while (n < number) {
            if (number % n == 0) {
                perfectNumber += n;
            }
            n++;
        }
        if (perfectNumber == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
