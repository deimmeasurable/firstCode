package selfPractise;

import java.util.Scanner;

public class Multiples {
    private static int firstUserInput;
    private static int secondUserInput;
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int counter = 1;
         firstUserInput=0;
        secondUserInput=0;
        int value=0;

        while (counter < 2) {
            System.out.println("Enter a number");
            firstUserInput = input.nextInt();

            System.out.println("Enter a number");
            secondUserInput = input.nextInt();



            if (firstUserInput % secondUserInput==0) {
                System.out.println(secondUserInputIsAMultiplyOfFirstInput());
            }
          else {
                System.out.println("it's not a multiple");
            }
        counter++;
        }
    }

    private static boolean secondUserInputIsAMultiplyOfFirstInput() {
        int count;
        for (count = 0; count < firstUserInput; count++) {

            int remainder = firstUserInput % secondUserInput;
            if(remainder==0){
                return true;

        }
    }
        return false;
}
}
