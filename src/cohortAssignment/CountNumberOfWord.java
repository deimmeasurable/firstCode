package cohortAssignment;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWord {
    public static void main(String[] args) {
        Map<String,Integer> value = new HashMap<>();
        String sentence = "cohort nine with value range value";

        String[] word = sentence.split(" ");

        for (String collectWord : word){


            value.merge(collectWord, 1, Integer::sum);
        }
        System.out.println(value);
    }
}
