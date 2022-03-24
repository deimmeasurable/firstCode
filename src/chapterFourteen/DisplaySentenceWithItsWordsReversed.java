package chapterFourteen;

import java.util.Scanner;

public class DisplaySentenceWithItsWordsReversed {
    String value;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        String number = scanner.nextLine();

//      String token = number.split(" ");
        String token = number;
        System.out.printf("the number of element %d%n: there are:", token.length());

        StringBuilder string = new StringBuilder();
        for (int i = token.length() - 1; i >= 0; i--) {
            if ((token.charAt(i) != token.length())) {
                string.append(token.charAt(i));

//            string.reverse();
            }

        }
        System.out.println(string + " ");
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
