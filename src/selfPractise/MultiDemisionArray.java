package selfPractise;

public class MultiDemisionArray {

    public static void main(String[] args) {
        int [][] number={{1,2,3},{4,5,6},{7,8,9}};

        for (int[] ints : number) {
            for (int column = 0; column < ints.length; column++) {
                System.out.print(ints[column] + " ");

            }
            System.out.println();
        }
    }

}
