package chapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class ConvertQuestionToNumber {
//    public static void main(String[] args) {
//        changeQuestionMarkToNumber("?");
//    }


    public static String changeQuestionMarkToNumber(String stringNumber) {
        String [] number ={ };
        String[]value={"1","2","3","?"};

        List<String> list = new ArrayList<>();
       number =stringNumber.split("\\s+");

         StringBuilder collectValue= new StringBuilder();

        for (int i = 0; i < number.length; i++) {
            if(number[i].charAt(i) == '?'){
                 collectValue.append(value[i]);
                break;
            }

        }

//        System.out.println(collectValue);
        return String.valueOf(collectValue);
    }
}
