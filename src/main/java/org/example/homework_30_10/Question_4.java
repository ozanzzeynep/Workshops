package org.example.homework_30_10;

import java.util.Arrays;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        //4-How to check if two Strings are anagrams of each other?

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word1 : ");
        String word1 = scanner.nextLine().toLowerCase();
        System.out.print("Enter word2 : ");
        String word2 = scanner.nextLine().toLowerCase();

        if(word1.length() != word2.length()){
            System.out.println("the two strings are not anagrams of each other.");
        }

        else{
            String [] newWord1 = word1.split("");
            String [] newWord2 = word2.split("");
            Arrays.sort(newWord1);
            Arrays.sort(newWord2);
            if(Arrays.equals(newWord1,newWord2)){
                System.out.println("The two strings are anagrams of each other.");
            }
            else{
                System.out.println("The two strings are not anagrams of each other.");
            }
        }
    }
}
