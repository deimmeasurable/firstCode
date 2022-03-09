package selfPractise;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerArithmetic {
    private static final SecureRandom input = new SecureRandom();
    private static final Scanner scan = new Scanner(System.in);
    private static int firstNumber = generateFirstNumberRandomly();
    private static int secondNumber = generateSecondNumberRandomly();
    private static int secretSummation = secretRandomResults(firstNumber,secondNumber);


    public static void selectionOfDifferentArithmetic() {
        System.out.println("Choose a Option: 1 for addition,\n 2 for multiplication,\n 3 for division,\n 4 for substration,and\n 5 for all arithmetic");
        int options = scan.nextInt();
        switch (options) {
            case 1 -> {
                System.out.println("for addition");
                additionArithmetic();
            }
            case 2 -> {
                System.out.println("for multiplication");
                multiplicationArithmetic();
            }
            case 3 -> {
                System.out.println("For Division");
                divisionArithmetic();
            }
            case 4 -> {
                System.out.println("For substration");
                substrationArithmetic();
            }
            case 5 -> {
                System.out.println("for all arithmetic");
                randomDisplayOfAllArithmetic();
            }
        }
    }

    public static void additionArithmetic() {
        int counter = 1;
        while (counter <= 10) {
            int randomNumber1 = 1 + input.nextInt(20);
            int randomNumber2 = 1 + input.nextInt(20);

            System.out.println(" Add the two numbers together:" + randomNumber1 + " Plus " + randomNumber2);
            System.out.println("Enter your answer:  ");
            int number = scan.nextInt();

            int totalRandomNumberForAddition = randomNumber1 + randomNumber2;

            if (number == totalRandomNumberForAddition) {
                System.out.println("Good: you are doing great");

            } else {
                System.out.println("Too bad!! you think it too cheap");
            }
            counter++;

        }

    }

    /*
    Arithemetic refactoring.
     */
    public static String additionArithmetiic(int answerFromUser){
        String message;
      if(answerFromUser == secretSummation){
          message = "Good: you are doing great";
          System.out.println(message);
      }
       message = "Too bad!! you think it too cheap";
        System.out.println(message);
        return message;
    }
    public static int generateFirstNumberRandomly(){
       int firstNumber = input.nextInt(2);
       return firstNumber;
    }
    public static int generateSecondNumberRandomly(){
       int secondNumber = input.nextInt(1);
       return secondNumber;
    }
    public static int secretRandomResults(int firstNumber, int secondNumber){
        firstNumber = generateFirstNumberRandomly();
        secondNumber = generateSecondNumberRandomly();
        return firstNumber + secondNumber;
    }


    public static void multiplicationArithmetic() {
        int count = 1;
        while (count <= 10) {
            int randomNumber1 = 1 + input.nextInt(12);
            int randomNumber2 = 1 + input.nextInt(12);

            System.out.println(" Multiply the two numbers together:" + randomNumber1 + " times " + randomNumber2);
            System.out.println("Enter your answer:  ");
            int number = scan.nextInt();

            int totalRandomNumberForAddition = randomNumber1 * randomNumber2;

            if (number == totalRandomNumberForAddition) {
                System.out.println("Good: you are doing great");

            } else {
                System.out.println("Oops!! you think it too cheap");
            }
            count++;

        }

    }

    public static void divisionArithmetic() {
        int range = 1;
        while (range <= 10) {
            int randomNumber1 = 1 + input.nextInt(20);
            int randomNumber2 = 1 + input.nextInt(20);

            System.out.println(" Divide the two numbers together:" + randomNumber1 + " Divide " + randomNumber2);
            System.out.println("Enter your answer:  ");
            int number = scan.nextInt();

            double totalRandomNumberForAddition =(double) randomNumber1 / randomNumber2;

            if (number == totalRandomNumberForAddition) {
                System.out.println("Good: you are doing great");

            } else {
                System.out.println("Ah, bad!! try again my bad");
            }
            range++;

        }
    }
   public static void substrationArithmetic(){
        int roll =1;
       while (roll <= 10) {
           int randomNumber1 = 1 + input.nextInt(20);
           int randomNumber2 = 1 + input.nextInt(20);

           System.out.println(" Substract the two numbers together:" + randomNumber1 + " Minus " + randomNumber2);
           System.out.println("Enter your answer:  ");
           int number = scan.nextInt();

           int totalRandomNumberForAddition = randomNumber1 - randomNumber2;

           if (number == totalRandomNumberForAddition) {
               System.out.println("Good: you are doing great");

           } else {
               System.out.println("Too bad!! you think it too cheap");
           }
           roll++;

       }
   }
   private static void randomDisplayOfAllArithmetic(){
        int display;
       display=(int) (Math.random() * 4 + 1);
       for (int i = 0; i <display ; i++) {
            if(i==5){
                break;
            }

           switch (display) {
               case 1 -> multiplicationArithmetic();
               case 2 -> additionArithmetic();
               case 3 -> divisionArithmetic();
               case 4 -> substrationArithmetic();
           }

       }
   }

    public static void main(String[] args) {
    selectionOfDifferentArithmetic();
    }
}

