package chapterFourteen;

import java.util.Scanner;

public class DisplaySentenceWithItsWordsReversed {
    String value;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        String number = scanner.nextLine();
        String[] token = number.split(" ");
        System.out.printf("the number of element %d%n: there are:", token.length);

            StringBuilder string = new StringBuilder();
        for (int i =0 ; i < token.length ; i++) {
            string.append(token[i]);

            string.reverse();
        }
        System.out.println(string+ " ");

        }
    }


//        public static void reverse () {
//            String value=" ";
//            StringBuilder string = new StringBuilder();
//            for (int i = value.length() - 1; i >= 0; i--) {
//
//                string.append(value.charAt(i));
//            }
//            System.out.println(string);
//        }
//    }
