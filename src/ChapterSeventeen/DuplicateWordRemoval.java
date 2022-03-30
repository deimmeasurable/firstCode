package ChapterSeventeen;

import java.util.Arrays;
import java.util.Locale;

public class DuplicateWordRemoval {
    public static void main(String[] args) {
        displayUniqueWord("The boy is real good");
    }
    public static  void displayUniqueWord(String sentence){
        sentence=sentence.toLowerCase(Locale.ROOT);
        Arrays.stream(sentence.split(" ")).distinct().sorted().forEach(System.out::println);
    }
}
