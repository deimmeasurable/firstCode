package selfPractise;

import java.util.Arrays;

public class IntegersDivisbleBy3 {
    public static void main(String[] args) {
        collectingNumbersFrom1To30();
    }

    public static void collectingNumbersFrom1To30() {
      int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] digits = new int[50];
        int counter = 1;
        int total = 0;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = i+1;
            System.out.println(i + " " + digits[i]);
           if (number[i] % 3 == 0) {
           System.out.println(number[i]);
            total+=number[i];


        counter++;
            }

            System.out.println(total);
        }

//        for (int i = 0; i < digits.length; i++) {
//            System.out.printf("%d%s%s", digits[i], ",", " ");
//        }
////        System.out.println(Arrays.toString(digits));

    }
}


