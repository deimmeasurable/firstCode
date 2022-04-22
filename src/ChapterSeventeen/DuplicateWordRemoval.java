package ChapterSeventeen;

import java.util.Arrays;
import java.util.Locale;

public class DuplicateWordRemoval {
    public static void main(String[] args) {
        displayUniqueWord("The boy is real good");
//        System.out.println((IntStream.rangeClosed(1,10)).reduce(1, Integer::sum)); functional interface;
    }
    public static  void displayUniqueWord(String sentence){
        sentence=sentence.toLowerCase(Locale.ROOT);
        Arrays.stream(sentence.split(" ")).distinct().sorted().forEach(System.out::println);
    }
}
