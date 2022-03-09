package chapterSeven;

import java.util.Scanner;

public class UsingTheEnhancedForStatement {
    public static void main(String[] args) {
        calculateAbsoluteValueOfNumber();
    }

    public static void calculateAbsoluteValueOfNumber(){
        Scanner scanner = new Scanner(System.in);
        int maximum=Integer.MIN_VALUE;
        int number=5;

        for ( int i = 0; i < 5; i++) {
            System.out.println("Enter five numbers");
            number =scanner.nextInt();


            if (number > maximum){
                maximum =number;
            }


        }
        System.out.println("The absolute value of number is: "+maximum);
    }

}
