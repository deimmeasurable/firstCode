package chapterSeven;

import java.util.Scanner;

public class SevenSegmentDisplay_2 {
    Scanner scan=new Scanner(System.in);
    private static int[][] segment={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};


    public static void sideADisplay(){
       for (int i=0;i< segment.length;i++){
            for (int j = 0; j < segment[i].length; j++) {
                segment [0][0]=1;
                segment [0][1]=1;
                segment [0][2]=1;
                segment [0][3]=1;


          }
        }

    }
    public static void sideCDisplay() {
        for (int i = 0; i < segment.length; i++) {
            for (int j = 0; j < segment[i].length; j++) {
                segment[2][3] = 1;
                segment[3][3] = 1;
                segment[4][3] = 1;
            }
        }
    }
    public static void sideDDisplay() {
//        for (int i = 0; i < segment.length; i++) {
//            for (int j = 0; j < segment[i].length; j++) {
                segment[4][0] = 1;
                segment[4][1] = 1;
                segment[4][2] = 1;
                segment[4][3] = 1;
            }
//        }
//    }
    public static void sideEDisplay(){
//        for (int i = 0; i <segment.length ; i++) {
//                for (int j = 0; j < segment[i].length; j++) {

                segment[2][0] = 1;
                segment[3][0] = 1;
                segment[4][0] = 1;
//            }
//        }
    }
    public static void sideFDisplay(){
//        for (int i = 0; i < segment.length; i++) {
//            for (int j = 0; j <segment[i].length ; j++) {

                segment[0][0]=1;
                segment [1][0]=1;
                segment [0][0]=1;
            }

//        }
//    }
    public static void sideGDisplay(){
//        for (int i = 0; i <segment.length ; i++) {
//            for (int j = 0; j <segment[i].length ; j++) {
                segment [2][0]=1;
                segment[2][1]=1;
                segment[2][2]=1;
                segment[2][3]=1;
            }

//        }
//    }




public static void display(){
    for (int i = 0; i < segment.length; i++) {
        for (int j = 0; j < segment[i].length; j++) {
           if (segment[i][j] == 1) System.out.print("#");
           else System.out.print(" ");

        }
        System.out.println();
    }
}
public static void sideBDisplay(){
//    for (int i = 0; i < segment.length ; i++) {
//        for (int j = 0; j < segment[i].length; j++) {
            segment[0][3] =1;
            segment[1][3]=1;
            segment[2][3]=1;
//        }
//
//    }
}
public static void promptUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 in 8 digit to display");
        String number = scanner.nextLine();

        if (number.charAt(segment.length) > 1)
//        {
//            throw new IllegalArgumentException("number is not valid");
//        }

    checkNumber(number);

}

    private static void checkNumber(String number) {

        if (number.charAt(0) == '1') sideADisplay();
        if (number.charAt(1) == '1') sideBDisplay();
        if (number.charAt(2) == '1') sideCDisplay();
        if (number.charAt(3) == '1') sideDDisplay();
        if (number.charAt(4) == '1') sideEDisplay();
        if (number.charAt(5) == '1') sideFDisplay();
        if (number.charAt(6) == '1') sideGDisplay();
        if (number.charAt(7) == '0'){
            for (int i = 0; i < segment.length; i++) {
                for (int j = 0; j < segment[i].length; j++) {
                    segment[i][j] = 0;
                }
            }
        }
    }


    public static void main(String[] args){
        promptUser();
        display();
}


}

