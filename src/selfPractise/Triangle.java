package selfPractise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        doubleTriangle();
    }


//    public static void printingTriangle() {
//        Scanner scan = new Scanner(System.in);
//        int counter = 0;
//        String[] number = new String[]{"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"};
//        for ( int a =1 ; a <= number.length; a++) {
//            for (int i = 1; i <=a; i++) {
//
//
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//        }
//
//    }

    public static void decreaseTriangle(){
        int number=4;
        for (int i = 0; i <= number ; i++) {
            for (int j = i; j <=number ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void doubleTriangle(){
        int number=4;
        for (int i = 0; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
