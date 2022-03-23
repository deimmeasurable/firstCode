package chapterFourteen;

import java.util.Locale;
import java.util.Scanner;

public class CountTheNUmberOfTimesWordCanBeFoundInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder string = new StringBuilder(200000);
        System.out.println("enter word");
        String userInput = scanner.nextLine();

        String[] str = userInput.split("");
        int count = 0;
        String word = "balloon";
        word = word.toUpperCase(Locale.ROOT);

        string.append(userInput);
        StringBuilder string2 = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            if (word.contains(str[i]) && str[i].equals(word)) {
                string2.append(str[i]);
                System.out.println(string2);
            }


        }
        count++;
        System.out.println(word + " " + count);
    }
}