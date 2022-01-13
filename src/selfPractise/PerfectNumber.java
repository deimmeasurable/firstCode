package selfPractise;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int total=0;
        for (int index = 1; index < number; index++) {

            if (number % index == 0) {
       //         System.out.println(index);
                total+=index;
            }

        }
        if(total==number) {
            System.out.println("it's perfect");
        }else {
        System.out.println("Not a perfect number");

            }



        }

    }




