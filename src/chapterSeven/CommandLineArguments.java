package chapterSeven;

import java.util.Scanner;

public class CommandLineArguments {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
int number=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            number=scanner.nextInt();

            if(number > maximum){
                maximum=number;
            }
            if (number < minimum){
                minimum= number;
            }
        }
        System.out.println("The minimum value is: "+ minimum);
        System.out.println("The maximum value is: "+maximum);
    }
}
