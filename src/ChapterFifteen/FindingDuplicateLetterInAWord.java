package ChapterFifteen;

import java.util.*;

public class FindingDuplicateLetterInAWord {
    public static void main(String[] args) {
//        findDuplicateLetterInAWord("look");
        capitalizedTheFirstLetterAfterWhitespace("the boy is good");
    }

    public static String findDuplicate(String word) {
        Map<Character, Integer> map = new HashMap<>();
        String collect = "";

        for (int i = 0; i < word.length(); i++) {

            if (map.containsKey(word.charAt(i))) {
                int count = map.get(word.charAt(i));
                map.put(word.charAt(i), ++count);
            } else {
                map.put(word.charAt(i), 1);
                collect = String.valueOf(map);

            }
        }
        System.out.println(collect);
        return collect;

    }

    public static int calculateSum(int[] value) {
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        return sum;
    }

    public static int getTheMaximumValue(int[] value) {
        int maximumValue = Integer.MIN_VALUE;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > maximumValue) {
                maximumValue = value[i];
            }
        }
        return maximumValue;
    }

    public static String getTwoElementPairOfTwoArray(int[] value, int number) {
        String collectValue = "";
        for (int i = 0; i < value.length - 1; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] + value[j] == number) {
                    collectValue = value[i] + "," + value[j];

                }

            }

        }
        return collectValue;
    }

    public static String findTheThreeElementThatWillGiveTheSum(int[] value, int number) {
        String collectValue = "";
        for (int i = 0; i < value.length - 2; i++) {
            for (int j = i + 1; j < value.length - 1; j++) {
                for (int k = j + 1; k < value.length; k++) {
                    if (value[i] + value[j] + value[k] == number) {
                        collectValue = value[i] + "," + value[j] + "," + value[k];
                    }

                }

            }

        }
        return collectValue;
    }

    public static int getTheIndexValueOfAnElement(int[] value, int number) {
        int elementValue = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == number) {
                elementValue = value[i];
            }

        }
        return elementValue;
    }

    public static int[] replaceAnElementValueInAnArray(int[] value, int number) {

        List<Integer> collect = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            if (value[i] == value[3]) {
                value[i] = number;
                collect.add(value[i]);
                System.out.println(collect);

            }

        }
        return value;
    }

    public static boolean checkIfAWordIsAPanlindrome(String word) {

        word = word.trim().toLowerCase();
        String[] collect = word.split("//+");
        for (int i = 0; i < collect.length; i++) {
            if ((collect[i].charAt(0)) == collect[i].charAt(collect[i].length() - 1)) {

                return true;
            }
        }
        return false;
    }

    public static String capitalizedtheFirstLetter(String word) {
        word = word.strip();
        String[] collect = word.trim().split("//+");
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < collect.length; i++) {
//            if(collect[i].equals(collect[0])){
            String newString = collect[i].substring(0, 1).toUpperCase();
            String newWord = newString + word.substring(1);


            string.append(newWord);
            string.append(" ");

        }
//        }
        return string.toString().trim();

    }

    public static void capitalizedTheFirstLetterAfterWhitespace(String word) {
        word = word.strip();
        String[] collect = word.trim().split("\\s+");
        StringBuilder string = new StringBuilder();
        for (String s : collect) {
//            if(collect[i].equals(collect[0])){
            String newString = s.substring(0, 1).toUpperCase();
            String newWord = newString + word.substring(1);


            string.append(newWord);
            string.append(" ");

        }
        System.out.println(string);
//        }
//        return string.toString().trim();
    }
}