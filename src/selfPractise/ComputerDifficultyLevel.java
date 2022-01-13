package selfPractise;

import java.util.Scanner;

public class ComputerDifficultyLevel {

    public static void main(String[] args) {
        // String startMultiplication = "Yes";
        int correctAnswerForLevelOne = 0;

        //while (startMultiplication.equals("yes")) {
        System.out.println("Welcome!!! You are in level one");
        int randomNumber1 = 1 + (int) (Math.random() * ((9 - 1) + 1));
        int randomNumber2 = 1 + (int) (Math.random() * ((9 - 1) + 1));
        int randomNumber3 = 10 + (int) (Math.random() * ((30 - 10) + 1));
        int randomNumber4 = 10 + (int) (Math.random() * ((30 - 10) + 1));

        int totalRandomNumberForLevelOne = randomNumber1 * randomNumber2;

        System.out.println(randomNumber1 + " times " + randomNumber2);


        System.out.println("Enter the total value of the two random number");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int counter = 1;

        while (counter <= 5) {
            randomNumber1 = 1 + (int) (Math.random() * ((9 - 1) + 1));
            randomNumber2 = 1 + (int) (Math.random() * ((9 - 1) + 1));
            System.out.println(randomNumber1 + " times " + randomNumber2);
            System.out.println("Enter the total value of the two random number");
            number = scan.nextInt();

            totalRandomNumberForLevelOne = randomNumber1 * randomNumber2;

            if (number == totalRandomNumberForLevelOne) {
                //  System.out.println("congratulation");
                correctAnswerForLevelOne++;
                //   System.out.println(correctAnswerForLevelOne);
            } else {
                System.out.println("ah!, you fail that question");

            }
            counter++;

        }
        if (correctAnswerForLevelOne > 4) {
            System.out.println("Congratulation!!! you have been promoted to level two ");
            levelTwo();
        } else {
            System.out.println("ah! too bad you are still in level one");

        }
    }

    private static void levelTwo() {
        int counter = 1;
        while (counter <= 5) {


            int randomNumber3 = 10 + (int) (Math.random() * ((30 - 10) + 1));
            int randomNumber4 = 10 + (int) (Math.random() * ((30 - 10) + 1));

            int totalRandomNumberForLevelTwo = randomNumber3 * randomNumber4;

            System.out.println(randomNumber3 + " times " + randomNumber4);

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the total value of the two random number");
            int number = scan.nextInt();

            if (number == totalRandomNumberForLevelTwo) {
                System.out.println("Genius! you are my guy");


        }
            else {
                System.out.println("You tried!! but you still need to brush up your brain on multiplication");
            }
            counter++;
        }


    }

}
