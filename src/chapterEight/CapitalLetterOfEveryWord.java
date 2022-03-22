package chapterEight;

import java.util.Scanner;

public class CapitalLetterOfEveryWord {
    Scanner input =  new Scanner(System.in);
    String word =input.nextLine();

    public void capitalisedEveryFirstWord(){
        for (int i = 0; i < word.length(); i++) {
//            if(word.equals(" ")){
        char text=    Character.toUpperCase(word.charAt(0));

                System.out.print(text);



//            } else if{
//                throw new IllegalArgumentException("not correct");
//            }


        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a word");
      CapitalLetterOfEveryWord firstWord= new CapitalLetterOfEveryWord();
            firstWord.capitalisedEveryFirstWord();

        }

        }


