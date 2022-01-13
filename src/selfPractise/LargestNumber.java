package selfPractise;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        findHighestNumber();
    }

    public static void findHighestNumber(){
        Scanner scan = new Scanner(System.in);
        int number=0;
        int counter =1;
        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        int total=0;
        while (counter<=10){
            System.out.println("Enter a number");
            number =scan.nextInt();
        //    System.out.println(number);
            if(number>maximum){
                maximum=number;
            }
            if(number<minimum){
                minimum=number;
            }
            total+=number;
            counter++;
        }
        System.out.println("the minimum value is %d  "+ minimum);
        System.out.println("the maximum value is %d  "+ maximum);
        System.out.println("the total value is %d  "+ total);
    }
}
