package chapterFourteen;

import java.util.Scanner;

public class TokenizingTelephoneNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        String number=scanner.nextLine() ;
        String []tokens= number.split(" ");
        System.out.printf("number of elements: %d%nThe tokens are :%n",tokens.length);

        for (String value:tokens) {

            System.out.print(value);
        }
    }

}


