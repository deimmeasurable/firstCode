package selfPractise;

public class PrimeDigit {


    public  void getPrimeNumberFrom1To10000(int number){

        for (int index = 2; index < number; index++) {
            if(isPrime(index)){
                System.out.println(index);
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

    public static void main(String[] args) {
        PrimeDigit prime = new PrimeDigit();
        prime.getPrimeNumberFrom1To10000(10000);
    }
}
