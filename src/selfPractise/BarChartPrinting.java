package selfPractise;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        BarChartPrinting bar=new BarChartPrinting();
        bar.CollectNUmberFrom1To30();
    }

    public void CollectNUmberFrom1To30(){
        Scanner input= new Scanner(System.in);

//        int counter=1;
//        System.out.println("ENTER 5 INTEGERS BETWEEN 1 AND 30:");
//        int firstUserInput = input.nextInt();
//        int secondUserInput = input.nextInt();
//        int thirdUserInput = input.nextInt();
//        int fourUserInput = input.nextInt();
//        int fifthUserInput = input.nextInt();

//        while (counter == firstUserInput){
//            System.out.print("*" +" ");
//            counter++;
//        }
//        System.out.println();
//        while (counter == 2){
//            System.out.print("*" +" ");
//            counter++;
//        }
//        System.out.println();
//        while (counter == 3){
//            System.out.print("*" +" ");
//            counter++;
//        }
//        System.out.println();
//        while (counter == 4){
//            System.out.print("*" +" ");
//            counter++;
//        }
//        System.out.println();
//        while (counter == 5){
//            System.out.print("*" +" ");
//            counter++;
 //       }

//        for ( int i = 1; i <= firstUserInput; i++){
//            System.out.print("*" + " ");
//        }
//        System.out.println();
//        for ( int i = 1; i <= secondUserInput; i++){
//            System.out.print("*" + " ");
//        }
//        System.out.println();
//        for ( int i = 1; i <= thirdUserInput; i++){
//            System.out.print("*" + " ");
//        }
//        System.out.println();
//        for ( int i = 1; i <= fourUserInput; i++){
//            System.out.print("*" + " ");
//        }
//        System.out.println();
//        for ( int i = 1; i <= fifthUserInput; i++){
//            System.out.print("*" + " ");
//        }
//        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
           for (int j = i; j<= 4; j++){
              System.out.print("& ");
           }
           System.out.println();
        }
        for (int i = 1; i <=4 ; i++) {
            for (int j = 4; j >= i; j--) {

                System.out.print(" #");
            }
            System.out.println();
        }
    }

}
