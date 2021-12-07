package chapterSix;

import java.util.Scanner;

public class PackingCharges {

    public static double calculateCharge(int hour) {
        double charges = 0.0;
          if (hour > 24){
              System.out.println("");
          }
          if (hour == 24){
               charges = 10.0;
          }
          if (hour < 3){
              System.out.println("");
          }
          if (hour == 3){
              charges = 2.0;
          }
          if (hour > 3){
              int excessHour = hour - 3;
              charges = (excessHour * 0.05) + 2.0;
          }
           return charges;
      }
    public static void main(String[] args) {
       System.out.println(        calculateCharge(5));
    }
}

//        if (hour > 24) {
//            double excesshour = 0.50 + 10.00;
//            System.out.printf("the value of excessHour is %.2f:", excesshour);
//        }
//       else{
//            System.out.println();
//    }
//}



