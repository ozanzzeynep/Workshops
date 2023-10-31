package org.example.homework_30_10;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        //5-How to determine if the string has all unique characters.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = scanner.nextLine();
        int count = 0;
        String temp = "";
        String [] tempWord = word.split("");
        for(int i = 0 ; i < tempWord.length;i++){
            if(!(temp.contains(tempWord[i]))){
                temp += tempWord[i];
            }
        }
        if(temp.equals(word)){
            System.out.println(word + " has all unique characters");
        }
        else{
            System.out.println(word + " has not unique characters.");
        }
    }
}
