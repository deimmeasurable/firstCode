package chapterFive;

import java.util.ArrayList;
import java.util.Scanner;

public class IdentifyPositiveAndNegative {
    private static ArrayList<Integer> value = new ArrayList<Integer>();


    public void checkIfNumberIsNegativeOrPositiveOrZero() {
        Scanner scanner = new Scanner(System.in);
        int counterForPositive = 0;
        int counterForNegative = 0;
        int counterForZero = 0;
        int len = 6;

        for (int i = 0; i < len; i++) {

            System.out.println("Enter a number");
            int input = scanner.nextInt();
            if (input > 0) {
                counterForPositive++;

                System.out.println(counterForPositive);
            }
            if (input < 0) {
                counterForNegative++;
                System.out.println(counterForNegative);
            }

            if (input == 0) {
                counterForZero++;
            }
            value.add(input);
        }


            double remainderForPositive;
            remainderForPositive = ((double)counterForPositive) / len;
            System.out.println(remainderForPositive);


            double remainderForNegative;
            remainderForNegative = ((double)counterForNegative) / len;
            System.out.println(remainderForNegative);



            double remainderForZero;
            remainderForZero = ((double)counterForZero) / len;
            System.out.println(remainderForZero);

    }


    public static void main(String[] args) {
        IdentifyPositiveAndNegative positive =new IdentifyPositiveAndNegative();
        positive.checkIfNumberIsNegativeOrPositiveOrZero();


    }

}

