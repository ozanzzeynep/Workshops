package org.example.homework_30_10;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        //3-Write a Java program gives character counts in a string Ex: Tobeto -> t:2, o:2, b:1, e:1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word : ");
        int[] count = new int[128];
        String word = scanner.nextLine().toLowerCase();
        for (char myChar : word.toCharArray()) {
            count[myChar]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                char myCh = (char) i;
                System.out.println(myCh + " = " + count[i]);
            }
        }
    }
}
