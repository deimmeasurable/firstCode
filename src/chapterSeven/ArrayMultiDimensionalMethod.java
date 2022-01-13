package chapterSeven;

public class ArrayMultiDimensionalMethod {
    public static void collectedArraysNumber(int [] [] array) {
      //  array = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4}};
        System.out.println("-".repeat(15));
        System.out.println("    Table");
        System.out.println("-".repeat(15));

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column< array[row].length; column++) {
                System.out.print(array[row][column] + "|  ");

            }
            System.out.println();
        }
        System.out.println("-".repeat(15));
    }

    public static void main(String[] args) {
    int [] []array = {{1,2,3,4},{1,2,3,4}};
     collectedArraysNumber(array);
    }

}