package selfPractise;

public class PrimeDigit {

    public  void getPrimeNumberFrom1To10000(int number) {

        for (int index = 2; index < number; index++) {
            if (isPrime(index)) {
                System.out.println(index);
            }

        }
    }
        public static void squareRootTwoFrom1To10000(int totalValue){

        for (int i = 4; i <totalValue; i++) {
            if (squareRootTwoForPrimeNumber(i)) {
                System.out.println(i);
            }
        }
        }


    private boolean isPrime(int number) {
        int remainder;
        for (int count = 2; count < number -1 ; count++) {
            remainder=number % count;

            if(remainder==0){
                return false;
            }

        }
        return true;
    }
    public static boolean squareRootTwoForPrimeNumber(int number){
        int remainder;
        for (int value = 4; value <number-1 ; value++) {
            remainder=number%value;

            if(remainder==0){
                return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("primeNumber"+"\t\t"+"SquareRootOfTwoPrime");
        System.out.println();
        PrimeDigit prime = new PrimeDigit();
        prime.getPrimeNumberFrom1To10000(10000);
    }
}
