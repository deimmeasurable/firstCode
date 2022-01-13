package selfPractise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyingExceptionHandling {

    public static void main(String[] args) {
        StudyingExceptionHandling exception=new StudyingExceptionHandling();
        exception.promptUserToEnterANumber();
    }

    public void promptUserToEnterANumber(){
        Scanner input=new Scanner(System.in);
        boolean loop = true;

        do {
            try {
                System.out.println("Enter a number");
                int number = input.nextInt();
                System.out.println(number);
                loop = false;

            } catch (Exception f) {
                  System.out.println("you have enter an invalid number");
                  input.nextInt();
//                System.out.println(f.getMessage());
//                System.out.println("You should enter a number");
//                input.nextInt();
//                System.out.println("Please try again");
            }
        } while(loop);
    }

    }

