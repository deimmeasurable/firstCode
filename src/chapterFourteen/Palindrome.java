package chapterFourteen;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String firstWord=scanner.nextLine();
//        String secondWord=scanner.nextLine();

StringBuilder value = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            value.append(firstWord.charAt(i));
            }
        System.out.println(value);
        if (firstWord.charAt(4) == firstWord.charAt(0)) {
            System.out.println("it is  a palindrome");
        }else {
            System.out.println("it not a palindrome");
        }
        if(firstWord.charAt(1) ==firstWord.charAt(2)){
            System.out.println("it a palindrome");
        }else{
            System.out.println("it  not  a palindrome");
        }

            }


            }




