package selfPractise;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 1000 + 1);
        System.out.println(randomNum);

        int number = promptUser("Enter a number");
        guessANumber(number, randomNum);

    }

    private static int promptUser(String message) {
        Scanner scan = new Scanner(System.in);

        System.out.println(message);
        return scan.nextInt();
    }


    private static void guessANumber(int number, int randomNum) {
        while (number != randomNum) {
            if (number > randomNum) {
                System.out.println("Too high");
            } else {
                System.out.println("too low");
            }
            number = promptUser("Enter num");
        }

        System.out.println("Congrats");
        number = promptUser("enter number 1 to start or 2 to quit");
        switch (number) {
            case 1 -> {
                //System.out.println("enter a number 1 to start again or 2 to quit");
                guessANumber(number, randomNum);
                break;
            }
            case 2 -> {
                System.exit(0);
                break;
            }
        }
    }
}