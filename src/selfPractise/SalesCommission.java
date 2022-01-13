package selfPractise;

import java.util.Scanner;

public class SalesCommission {
    public static double salesperson;

    public static void main(String[] args) {
displaySalesCommission();
        System.out.printf("the total commission for sale is %.2f",salesperson);
    }

    public static double commission() {
        double commission = 200 + 0.9;
        return commission;
    }

    public static double salesperson() {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value");
        double value = scan.nextDouble();
        int counter=0;
        salesperson = value + commission();
      while (value!=-1){
          System.out.println("enter a number");
           value =scan.nextDouble();
           counter++;
      }

        return salesperson;
    }

    public static double displaySalesCommission() {
       double display= commission()+salesperson();

        return display;
    }
}



