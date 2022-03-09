package ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    static int result=0;
    public static void main(String[] args) {

check();
        System.out.println(result);
    }
        public static void check() {
            Scanner scanner = new Scanner(System.in);
            String message = input("enter a number");


            try {

               int number = scanner.nextInt();
           result =number/2;

            } catch (InputMismatchException ex) {
                System.out.println("wrong input");
                check();
            }


        }

        private static String input (String message){
            System.out.println("enter a number");
            return message;
        }
}

