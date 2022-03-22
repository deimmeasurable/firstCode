package ChapterEleven;

import java.util.ArrayList;
import java.util.List;

public class StringWord {
//    public static void main(String[] args) {

//
//       String word = "BALLOON";
//       StringBuilder text =new StringBuilder();
////
////        for (int i = word.length()-1;i>=0 ; i--) {
////
////
////            text.append(word.charAt(i));
////
//
////        System.out.print(text);

        public List<Integer> theIndexOfSInTheWord(String word, String number) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                if (String.valueOf(word.charAt(i)).equalsIgnoreCase(number)) {
                    list.add(i);
                }

            }
            System.out.println(list);
            return list;


        }
        public void removeSpaceThroughTrim(String word) {
            StringBuilder wordletter = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                if (!(word.charAt(i) == ' ')) {

                    wordletter.append(word.charAt(i));
                }
            }
            System.out.println(wordletter);
        }
    public static void main(String[] args) {
        StringWord indexOfword = new StringWord();
       indexOfword.removeSpaceThroughTrim("    chair   man    ");
       indexOfword.theIndexOfSInTheWord("miSSisSppi","i");

    }
    }
