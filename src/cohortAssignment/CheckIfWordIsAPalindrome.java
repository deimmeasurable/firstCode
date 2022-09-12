package cohortAssignment;

import java.util.Locale;
import java.util.Scanner;

public class CheckIfWordIsAPalindrome {

    public static void main(String[] args) {
checkIfWordIsAPalindrome();
    }
    public static boolean checkIfWordIsAPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        word=word.toLowerCase(Locale.ROOT).trim();
        StringBuilder collectPalindrome = new StringBuilder();
        StringBuilder collectNotAPalindrome = new StringBuilder();
        StringBuilder value= new StringBuilder();
        String [ ] searchWords =word.split("//+");
        for (int i =searchWords.length-1; i >=0; i--) {

            if ((searchWords[i].charAt(0)) == (searchWords[i].charAt(searchWords[i].length() - 1))) {
                collectPalindrome.append(searchWords[i]);
                collectPalindrome.reverse();
                System.out.println(collectPalindrome + " is a palindrome");

                return true;
            } else {
                collectNotAPalindrome.append(searchWords[i]);
                collectNotAPalindrome.reverse();
            }



        }


        System.out.println(collectNotAPalindrome +" is not a palindrome");

        return false;

    }


}
