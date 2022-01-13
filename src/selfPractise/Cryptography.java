package selfPractise;

import java.util.Scanner;

public class Cryptography {



    public static void main(String[] args) {
        Cryptography encrypt = new Cryptography();
        collectionOfDigit();
    }

    public static void collectionOfDigit() {
        Scanner scan = new Scanner(System.in);
        int firstDigit;
         int secondDigit;
         int thirdDigit;
         int fourDigit;

        int number;
        System.out.println("enter a four digit");
        number = scan.nextInt();

        firstDigit = number / 1000;
        firstDigit += 7;
        firstDigit = firstDigit % 10;
        System.out.println("The value of firstNumber is " + firstDigit);

        secondDigit = (number % 1000) / 100;
        secondDigit += 7;
        secondDigit = secondDigit % 10;
        System.out.println("the value of secondNumber is " + secondDigit);

        thirdDigit = (number % 100) / 10;
        thirdDigit += 7;
        thirdDigit = thirdDigit % 10;
        System.out.println("The value of thirdNumber is " + thirdDigit);

        fourDigit = (number % 10);
        fourDigit += 7;
        fourDigit = fourDigit % 10;
        System.out.println("the value of fourNumber is  " + fourDigit);

        if (firstDigit == thirdDigit) {
            if (secondDigit == fourDigit) {
                System.out.println("It is an encrypt");
            }
        }
        if (firstDigit != thirdDigit) {
            if (secondDigit != fourDigit) {
                System.out.println("it is not encrypt");
            }
        }

    }

}





