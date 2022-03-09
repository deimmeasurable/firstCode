package selfPractise;

import java.util.Scanner;

public class SumOfDigit {
    private static int number;
    public static void main(String[] args) {
        System.out.println("enter four digit number");
        requestInput();
    }


    public static void fourDigitCollection(){




        int firstDigit= number/1000;
        System.out.println("The value of the firstDigit is  "+firstDigit);

        int secondDigit=(number % 1000)/100;
        System.out.println("The value of the secondDigit is  "+secondDigit);

       int thirdDigit=(number % 100)/10;
        System.out.println("The value of the thirdDigit is "+thirdDigit);

        int fourDigit= (number % 10);
        System.out.println("The value of the fourDigit is  "+fourDigit);

        int totalDigit= firstDigit + secondDigit + thirdDigit + fourDigit;


        System.out.println("The total digit is  " + totalDigit);




    }
    public static int input(){
        Scanner input=new Scanner(System.in);
        return number=input.nextInt();
    }
    public static void requestInput(){
        input();
        fourDigitCollection();
    }
}
