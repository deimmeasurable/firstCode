package selfPractise;

import java.util.Scanner;

public class ComputerDifficultyLevel {
private static final Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        int correctAnswerForLevelOne = 0;


        System.out.println("Welcome!!! You are in level one");

        int number;
        int counter = 1;

        while (counter <= 5) {
           int randomNumber1 = 1 + (int) (Math.random() * ((9 - 1) + 1));
            int  randomNumber2 = 1 + (int) (Math.random() * ((9 - 1) + 1));
            System.out.println(randomNumber1 + " times " + randomNumber2);
            System.out.println("Enter the total value of the two random number");
            number = scan.nextInt();

           int totalRandomNumberForLevelOne = randomNumber1 * randomNumber2;

            if (number == totalRandomNumberForLevelOne) {
                correctAnswerForLevelOne++;

            } else {
                System.out.println("ah!, you fail that question");

            }
            counter++;

        }
        if (correctAnswerForLevelOne > 4) {
            System.out.println("The total score is "+correctAnswerForLevelOne);
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
