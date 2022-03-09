package chapterSeven;

import java.util.Arrays;

public class Question_7_8 {
    public static void main(String[] args) {
        char[] r = new char[10];
        r[0] = 'r';
        r[1] = 'r';
        r[2] = 'r';
        r[3] = 'r';
        r[4] = 'r';
        r[5] = 'r';
        r[6] = 'r';
        r[7] = 'r';
        r[8] = 'r';
        r[9] = 'r';


        for (int i = 0; i < r.length; i++) {

            System.out.println(Arrays.toString(r));

        }
        //question 7b
        int[][] g = {{1, 2, 3}, {1, 2, 3, 4, 5, 4, -1}};
        for (int i = 1; i < g.length; i++) {
            System.out.println(g[1][6]);

        }
        //question 7c
        double[] c = {1.0, 2.3, 4.5, 6.5};
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int number = 0, cLength = c.length; number < cLength; number++) {

            if (number > maximum) {
                maximum = number;
            }
            if (c[3] < minimum) {
                minimum = number;
            }

        }
//        System.out.println("The value of minimum " + minimum);
//        System.out.println("the value of maximum " + maximum);

    // question 7D
        int[]a={1,2,3,4};


        for (int i = 3; i <=a.length; i--) {
//            for (int b = 0; b <= a.length ; b++) {
                System.out.print(a[i]);

            }
            System.out.println(" ");
        }

    }

