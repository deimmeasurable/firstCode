package selfPractise;

public class SquareAsterisks {
    public static void main(String[] args) {
        SquareAsterisks value=new SquareAsterisks();
        value.squareDisplay();
    }

    public void squareDisplay() {


        String[][] square = new String[4][4];
        for (int row = 1; row <= square.length; row++) {
            for (int column = 1; column <= square.length; column++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
