package ChapterFifteen;

import java.util.Arrays;

public class FindingAMaximumInteger {
    public static void main(String[] args) {
        int[] value = {10, 6, 17};
//        findTheMaxiMaximumValueIntAnArray(value);
        sortThearray(value);
    }

    public static int findTheMaxiMaximumValueIntAnArray(int[] value) {
        int highest = 0;
        int maximumValue = Integer.MIN_VALUE;
        int minimumValue = Integer.MAX_VALUE;

        for (int i = 0; i < value.length; i++) {

            for (int j = i; j < value.length; j++) {


                if (value[i] > maximumValue) {
                    maximumValue = value[i];
//                    highest = maximumValue;
                } else if (value[i] < minimumValue) {
                    minimumValue = value[i];
                    System.out.println(minimumValue);
                } else if (value[i] > maximumValue && value[i] < maximumValue) {
                    highest = value[i];
                }
            }
//            System.out.println(maximumValue);
//            System.out.println(highest);

        }
        System.out.println(maximumValue);
        System.out.println(highest);
        return maximumValue;
    }

    public static void sortThearray(int[] number) {
//        Integer[] collect = new Integer[number.length];
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] == number.length) {
//                collect[i] = number[i];
//            }
            Arrays.sort(number);
            System.out.println(Arrays.toString(number));
        }
    }



