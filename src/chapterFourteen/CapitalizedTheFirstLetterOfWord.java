package chapterFourteen;

public class CapitalizedTheFirstLetterOfWord {


//    public static void main(String[] args) {
//        getEachCharacter();
////        checkEachCharacterInSeriesOfCharacterThatFormTheWord();
////        getEachCharacter();
//    }

    //    public static void getEachCharacter() {
//        int count = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a series of character");
//        StringBuilder string = new StringBuilder(200000);
//        String wordle = scanner.nextLine();
////        string.append(wordle);
//        String[] word = wordle.split("");
////
// StringBuilder element = new StringBuilder();
//        for (int i = 0; i < word.length; i++) {
//            if (word[0].equals(word[i])) {
//
//
//
//                    word[i] =  word[i].substring(0, 1).toUpperCase() + word[i].substring(1, word.length);
//
//                    System.out.println(Arrays.toString(word));
//
//                }
//            }
//
//        }
//    }\
//    public static class CapitalizeFirstCharacter {
//
//        public static void main(String[] args) {
//
//            System.out.println(capitailzeFirstCharacterOfString("the boy is good")); //supply input string here
//        }
//
//        private static String capitailzeFirstCharacterOfString(String strToCapitalize) {
//
//            if (Objects.nonNull(strToCapitalize) && !strToCapitalize.isEmpty()) {
//                return strToCapitalize.substring(0, 1).toUpperCase() + strToCapitalize.substring(1);
//            } else {
//                return "Null or Empty value of string supplied";
//
//            }
//
//        }
//
//    }

    public static void main(String[] args) {
        String str = "the boy is good";
        StringBuilder capitalizedString = new StringBuilder();
        String[] splited = str.trim().split("\\s+");

        for (String string : splited) {
            String s1 = string.substring(0, 1).toUpperCase();
            String nameCapitalized = s1 + string.substring(1);

            capitalizedString.append(nameCapitalized);
            capitalizedString.append(" ");
        }
        System.out.println(capitalizedString.toString().trim());
    }
}





//    public static Boolean checkEachCharacterInSeriesOfCharacterThatFormTheWord() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter series of character");
//        StringBuilder value = new StringBuilder(200000);
//        String serieOfCharacter = scanner.nextLine();
//        value.append(serieOfCharacter);
//        StringBuilder string = new StringBuilder();
//        int count = 0;
//
//        //pick a letter from given word
//        //compare picked letter to every letter in entered string of alphabets
//        //if characters are equal save character in variable
//
//        for (int i = 0; i <collect.length() ; i++) {
//            for (int j = 0; j < serieOfCharacter.length(); j++) {
//                if (String.valueOf(collect.charAt(i)).c(String.valueOf(serieOfCharacter.charAt(j)))) {
////                   System.out.println(collect);
//                    string.append(serieOfCharacter.charAt(i));
//                    System.out.println(string);
//                }
////
//            }
//        }
//        count++;
//        System.out.println("The amount times the word occurs:" + count);
//        if(count==serieOfCharacter.length()){
//            return true;
//        }
//        return false;


//    public static int collectCharacter() {
//        String value = "balloon";
//        int count = 0;
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine().toLowerCase();
//        for (int counter = 0; counter < word.length(); counter++) {
//            for (int index = 0; index < value.length(); index++) {
//                if (value.charAt(index) == word.charAt(counter) && count == value.length()) {
//                    System.out.println(word.charAt(counter));
//                    word = word.replace(String.valueOf(word.charAt(counter)), "");
//                    System.out.println(word);
//                    count++;
//                }
//            }
//        }
//        return 0;
//    }
//}
//
//    public static void main(String[] args) {
//        collectCharacter();
//    }
//    }
//}

