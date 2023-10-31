package org.example.homework_30_10;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        //6-Write a Java program finds first two amicable pairs. (Output: 1-> 220-284 2: 1184-1210)

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        int total1 = 0;
        int total2 = 0;
        for(int i = 1;  i < num1; i++){
            if(num1 % i == 0){
                total1 += i;
            }
        }
        for(int i = 1; i < num2 ; i++){
            if(num2 % i == 0){
                total2 += i;
            }
        }
        if(total1 == num2 && total2 == num1){
            System.out.println("Amicable pairs");
        }
        else{
            System.out.println("not Amicable pairs");
        }
    }
}
