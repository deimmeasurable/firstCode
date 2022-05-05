package chapterFourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConvertQuestionToNumber {
    public static void main(String[] args) {
//        changeQuestionMarkToNumber("?");
//        solve({4, 5, 6, 7, 9} ,3);
    }


//    public static String changeQuestionMarkToNumber(String stringNumber) {
//        String [] number ={ };
//        String[]value={"1","2","3","?"};
//
//        List<String> list = new ArrayList<>();
//       number =stringNumber.split("\\s+");
//
//         StringBuilder collectValue= new StringBuilder();
//
//        for (int i = 0; i < number.length; i++) {
//            if(number[i].charAt(i) == '?') {
//                collectValue.append(value[i]);
//                break;
//            }
//        return String.valueOf(collectValue);
//    }
public  static int solve(int[] heights, int k) {
    Scanner scanner = new Scanner(System.in);
    int value = 0;
    int max=0;
    int value1 = value;
//    heights=[value];
    List<Integer> list = new ArrayList<>();


    for(int i=0; i<heights.length;i++){
        list.add(heights[i]);
         max = Collections.max(list);
        
    }
    System.out.println(max);
return max;
}

}

