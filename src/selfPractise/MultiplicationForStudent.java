package selfPractise;

import java.util.Scanner;

public class MultiplicationForStudent {
    public static void main(String[] args) {
        String gameStatus = "yes";
        int numberOfPlays =0;
        int correctAnswer=0;
        double correctAnswerPercentage=0;


        while (gameStatus.equals("yes")) {
            int randomNumber1 = (int) (Math.random() * 12 + 1);
            int randomNumber2 = (int) (Math.random() * 12 + 1);

            int totalRandomNumber = randomNumber1 * randomNumber2;
            System.out.println(randomNumber1 + " times " + randomNumber2);

            Scanner input = new Scanner(System.in);

                System.out.println("enter the total value of the random number: ");
                int number = input.nextInt();
                numberOfPlays++;

                    while (number!=-1) {
                        if (number == totalRandomNumber) {
                            if(numberOfPlays<5) {
                                System.out.println("congratulation, enter yes to keep playing and no to stop playing");
                                gameStatus = input.next().toLowerCase();
                                numberOfPlays++;
                                correctAnswer++;
                                correctAnswerPercentage=(double)(numberOfPlays * correctAnswer)/100;
                                break;
                            }
                            else {
                                System.out.println("good!! but after many trials");
                                System.out.println("you played " + numberOfPlays + " times.");
                                System.exit(0);
                            }
                        } else if (number != totalRandomNumber) {
                            System.out.println("oops!, try again");
                            System.out.println("attempt the question again");
                            number = input.nextInt();
                            numberOfPlays++;
                            correctAnswer++;
                            correctAnswerPercentage=(double)(numberOfPlays * correctAnswer)/100;

                            if (number==-1) System.exit(0);
                        }else if (number==-1) System.exit(0);

//
                    }
                System.out.println("you played " + numberOfPlays + " times.");
            System.out.println("the correctAnswer score is "+correctAnswer);
            System.out.println("the percentage score is "+ Math.ceil(correctAnswerPercentage));
                }

        }
    }
