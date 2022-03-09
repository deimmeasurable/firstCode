package selfPractise;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
        display();
    }




    public static void display(){
        Scanner scan = new Scanner(System.in);
int []number = new int[]{1,2,3,4,5};
        System.out.println("N"+ "\tN^2" +  "\tN^3"  +  "\tN^4");

        for (int value = 1; value<=number.length; value++) {

            System.out.println((int)Math.pow(value,1)+ "\t"+((int)Math.pow(value,2))+"\t"+((int)Math.pow(value,3))+"\t"+((int)Math.pow(value,4)));

        }
}
}