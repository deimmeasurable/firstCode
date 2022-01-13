package selfPractise;

import java.util.Random;
import java.util.Scanner;

public class ChristmasQuestion {
    private char[] answers = new char[5];
    private static char[] rightAnswer = {'A', 'B', 'B', 'A', 'A', 'B'};

    public static void main(String[] args) {
        questions();
    }

    public static void questions() {
        Scanner scan = new Scanner(System.in);
        String[] question={};
        String questions = """
                press 1: question1:When is Christmas celebrated?\n options:\n A.25th December \n B.30th December
                press 2: question2:The traditional Christmas tree originated from which country?\noptions:\n A.Italy\n B.Germany
                press 3:  Question3: Name the first US president who decorated the Christmas tree at the White House.\noptions:\n A.Barrack Obama \n B.Franklin Pierce
                press 4: Question4: What does the red color of Christmas symbolize?\n options:\n A.Blood of Jesus.\n B. Suffering of Jesus christ
                press 5: Question5:  What does the green color of Christmas signify?\n options:\n A.Continuity of life \n B. Continuity of nature.
                press 6: Question6: People buy Artificial Christmas trees more than real ones"\n options\n A.False \n B. True
                """;


       // System.out.println(questions);
        Random randomizer = new Random();
        int Question1 = randomizer.nextInt(100);
        int Question2 = randomizer.nextInt(100);
        int Question3 = randomizer.nextInt(100);

        int userPick = randomizer.nextInt(6);
        int counter = 0;
        while (counter==5) {
            System.out.println(userPick);
        }
         {


            switch (userPick) {
                case 1:
                    System.out.println("Question1:When is christmas celebrated?\noptions:\n A.25th December \n B.30th December");
                    break;
                case 2:
                    System.out.println("Question2:The traditional christmas tree originated?\noptions:\n A.Italy\n B.Germany");
                    break;
                case 3:
                    System.out.println("Question3:Name the first US president who decorated the christmas tree at the White House?\noptions:\n A.Barrack Obama \n B.Franklin Pierce");
                    break;
                case 4:
                    System.out.println("Question4:What does the red colour of christmas symbolize?\nA.Blood of Jesus.\n B. Suffering of Jesus christ");
                    break;
                case 5:
                    System.out.println("Question5:What does the green color of Christmas signify?\nA.Continuity of life \n B. Continuity of nature.");
                    break;
                case 6:
                    System.out.println("Question5:People buy Artificial Christmas trees more than real ones?\noptions\n A.False \n B. True");
                    counter++;
            }

            System.out.println("pick an option");
            char option = scan.next().charAt(0);

        }

    }
    public static char[] answers() {
        char[] rightAnswer = new char[]{'A', 'B', 'B', 'A', 'A', 'B'};
        for (int i = 0; i < rightAnswer.length; i++) {

        }
        return rightAnswer;
    }

    private static int generateRandomNumber(String questions) {
        int randomNumber = (int) (Math.random() * 5) + 1;
        return randomNumber;
    }

    private char input() {
        Scanner input = new Scanner(System.in);
        return input.next().charAt(0);
    }
    public static void markOption(){
        char[] option = new char[0];
        if(option==rightAnswer){

        }
    }
}
