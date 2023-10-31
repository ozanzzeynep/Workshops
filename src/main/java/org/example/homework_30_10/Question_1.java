package org.example.homework_30_10;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
       // 1-Write a Java program to check if the entered number is Armstrong number?

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        int result = 0;
        int tempNum = number;
        int temp = number;
        int digit = 0;
        if(number <= 0 ){
            System.out.println("Enter a number greater than 0");
        } else if (number > 0) {

            while(tempNum != 0){
                tempNum /= 10;
                digit++;
            }
            for(int i = 1; i <= digit ; i++){
                result += Math.pow(temp % 10,digit);
                temp = temp / 10;
            }
            System.out.println(result);
            if(result == number){
                System.out.println(number + " is an Armstrong number. ");
            }
            else{
                System.out.println(number + " is not an Armstrong number. ");
            }
        }
    }
}
