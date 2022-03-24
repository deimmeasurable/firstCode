package chapterFourteen;

import java.util.Locale;
import java.util.Scanner;

public class CountTheNUmberOfTimesWordCanBeFoundInAString {

    private static  String collect;
    public static void main(String[] args) {
        getEachCharacter();
checkEachCharacterInSeriesOfCharacterThatFormTheWord();
//        getEachCharacter();
    }
public static  String getEachCharacter(){
        String word = "balloon";
        word =word.toUpperCase(Locale.ROOT);
    for (int i = 0; i <word.length() ; i++) {
        collect = String.valueOf(word.charAt(i));
//       System.out.print(collect);

    }
    return null;
}
public static  void  checkEachCharacterInSeriesOfCharacterThatFormTheWord(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter series of character");
    StringBuilder value = new StringBuilder(200000);
   String serieOfCharacter=scanner.nextLine();
    value.append(serieOfCharacter);
    StringBuilder string = new StringBuilder();
    int count=0;

    for (int i = 0; i <serieOfCharacter.length() ; i++) {
        if(collect.equalsIgnoreCase(String.valueOf(serieOfCharacter.charAt(i)))){
            string.append(serieOfCharacter.charAt(i));
            count++;
        }


    }
    System.out.println("The amount times the word occurs:" + count);


}

//
//        public static int collectCharacter (){
//            String value = "balloon";
//            int count = 0;
//            Scanner scanner = new Scanner(System.in);
//            String word = scanner.nextLine().toLowerCase();
//            for (int counter = 0; counter < word.length(); counter++) {
//                for (int index = 0; index < value.length(); index++) {
//                    if (value.charAt(index) ==  word.charAt(counter) && count < value.length()){
//                        System.out.println(word.charAt(counter));
//                        word = word.replace(String.valueOf(word.charAt(counter)), "");
//                        System.out.println(word);
//                        count++;
//                    }
//                }
//            }
//            return 0;
//        }
//
//    public static void main(String[] args) {
//        collectCharacter();
//    }
    }

