package ChapterSixteen;

import java.util.HashMap;
import java.util.Locale;

public class CountNumberOfLetter {
    public static void main(String[] args) {
        CountNumberOfLetter number = new CountNumberOfLetter();
        number.collectEachLetters("Ballon go");
    }

    public void collectEachLetters(String letter) {
        letter=letter.toLowerCase(Locale.ROOT);
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = letter.toCharArray();

        for (char countOfeachCharacter : strArray) {
            if(countOfeachCharacter==' ') {
                continue;
            }
            if (charCountMap.containsKey(countOfeachCharacter)) {
                charCountMap.put(countOfeachCharacter, charCountMap.get(countOfeachCharacter) + 1);
            } else {
                charCountMap.put(countOfeachCharacter, 1);
            }

        }
//       for (Map.Entry entry : charCountMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
           System.out.println(charCountMap);

        }
    }





