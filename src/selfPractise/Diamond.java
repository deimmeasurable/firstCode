package selfPractise;

public class Diamond {
    public static void main(String[] args) {
        Diamond shape=new Diamond();
        shape.printDiamond();
    }

    public void printDiamond(){
        int number=4;
        for (int row = 1; row <= number; row++) {
            for (int column = row; column <=number ; column++) {
                System.out.print("  ");
            }
            for (int column = 1; column < row; column++) {
                System.out.print("* ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");

            }
            for (int column = row; column < number ; column++) {
                System.out.print("* ");
            }
            for (int column = row; column <= number ; column++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
