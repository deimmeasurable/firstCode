package selfPractise;

public class DivisibleBy5 {
    public static void main(String[] args) {
        DivisibleBy5 five=new DivisibleBy5();
        five.isDivisibleBy5(60);
    }


    public void calculateNumberDivisibleBy5(int number){


       for (int index = 1; index < number ; index++) {
           isDivisibleBy5(index);
           System.out.println(index);

       }

   }

    private boolean isDivisibleBy5(int number) {
        int count;
        int remainder;
        for (count = 0; count <number ; count++) {
            remainder=number % 5;
            if(remainder == 0){
                System.out.println("true");
                return true;
            }

        }
        System.out.println("not divisible");
        return false;
    }
}
