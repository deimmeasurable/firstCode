package ChapterSixteen;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(IntStream.rangeClosed(1,10).sum());


    }

    public static Set<Integer> returnPrimeFactors(int number) {
        Set<Integer> primeFactors = new HashSet<>();
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    primeFactors.add(i);
                    returnPrimeFactors(number / i);

                }
            }
        }
        if (primeFactors.size() == 0) {
            return java.util.Set.of(1, number);
        }
        System.out.println();
        return primeFactors;
    }


    private static boolean isPrime(int i) {
    return true;
   }

}

