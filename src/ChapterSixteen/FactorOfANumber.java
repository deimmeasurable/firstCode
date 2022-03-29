package ChapterSixteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorOfANumber {
    public static void main(String[] args) {
        FactorOfANumber number = new FactorOfANumber();
//    number.collectFactorsOfANumber();
        number.collectPrimeNumbers(0);


    }

    public void collectFactorsOfANumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                list.add(i);
                count++;
            }

        }
        System.out.println(list);
        System.out.println("total number of count" + count);
    }

    public void collectPrimeNumbers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        number = scanner.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (isPrime(i)) {
                list.add(i);
                count++;

            }

        }
        System.out.println(count);
        System.out.println(list);
    }

    private boolean isPrime(int i) {
        int primeNumber = 0;
        for (int j = 2; j <i-1; j++) {
            primeNumber=i%j;
            if(primeNumber==0){
                return false;
            }

        }
return true;
    }

}