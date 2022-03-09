package selfPractise;

public class FillCharacter {
    public static void main(String[] args) {
        char[][] fill={{'#', '#', '#', '#', '#'}, {'#', '#', '#', '#', '#'}};
        for (int row = 1; row<= fill.length ; row++) {
            for (int column = 1; column<=fill.length ; column++) {
                System.out.print('#');

            }
            System.out.println();
        }
    }
}
