package chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class FindingAWordOutOfManyCharacter {
    public static void main(String[] args) {
        String word ="balloonballoon";
        String[] theWord = {"b", "a", "l", "o", "n"};
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < theWord.length; i++) {
            int count = 0;
            char _char = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {

                if (String.valueOf(word.charAt(j)).equals(theWord[i])) count++;
            }
            list.add(count);
            if (list.get(i) < min) min = list.get(i);
        }
        System.out.println(min);


    }
}