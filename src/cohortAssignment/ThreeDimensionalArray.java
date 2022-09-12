package cohortAssignment;

public class ThreeDimensionalArray {
    public static void main(String[] args) {


        int[][][] value = {{{10, 11, 3}}, {{50, 34, 23}},{{12,23,14}}};

        for (int i =0; i < value.length; i++) {
            for (int j = 0; j <value[i].length; j++) {
                for (int k = 0; k < value[i][j].length; k++) {
                    System.out.println("[" + i + "] [" + j + "][" + k +"]:"+ value[i][j][k]);
                }
            }
        }
    }
}