package cohortAssignment;

import java.util.Scanner;

public class FindingAPrimeNumber {
    private static int number;

    public static void main(String[] args) {
        collectPrimeNumber();
    }

    public static boolean collectPrimeNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        number = input.nextInt();
        int collectPrimeNumber = 0;
        int collectNotPrimeNumber = 0;
        for (int index = 2; index < number - 1; index++) {
            if (number % index == 0) {
                collectNotPrimeNumber = number;
                System.out.println(collectNotPrimeNumber +" number is not prime");
                return false;
            }

            }
        collectPrimeNumber=number;
        System.out.println(collectPrimeNumber +" number is prime");
        return true;

        }





//    private static boolean isPrime(int number) {
//        int remainder =0;
//        for(int count=2;count<number-1;count++){
//            remainder=number % count;
//            if(remainder==0){
//                return false;
//            }
//        }
//        return true;
//    }
}
