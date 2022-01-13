package chapterSeven;

import java.util.Scanner;

public class ArrayClassWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int total = 0;
        int ARRAY_LENGTH =10;
        int[] score = new int[ARRAY_LENGTH];

        System.out.println("Enter 10 number");
        for(int number = 0; number< score.length; ++number){
            score[number] =scan .nextInt();


               total = score[number] + total;

               int grade = score[number];
               if(grade > maximum){
                   maximum =grade;


               }
               if(grade < minimum){
                   minimum = grade;
               }
        }

           int average = total/10;
        for (int count = 0;count<10;++count){
            System.out.println(score[count]);
        }
        System.out.println("the value of the Total is  "+total );
        System.out.println("the value of the average is  "+average);
        System.out.println("the value of the maximum is  "+maximum );
        System.out.println("the value of the minimum is  "+ minimum);
    }

}
