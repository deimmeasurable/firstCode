package selfPractise;

import java.util.Scanner;

public class Extremes {

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        int number;
         int maximum=Integer.MIN_VALUE;
        int minimum= Integer.MAX_VALUE;
        int total = 0;
        int counter = 1;

        do {
            System.out.println("Enter a number");
            number = input.nextInt();

            if (maximum < number) {
                maximum=number;
            }
            if (minimum > number) {
                minimum=number;
            }
            total = maximum + minimum;
            counter++;
        }
        while (counter <= 10);


        System.out.println("The maximum value is " + maximum);
        System.out.println("The minimum value is "+ minimum);
        System.out.println("The total value is " +total);
    }
}

