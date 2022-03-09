package ChapterEleven.turtleproject;

public class SketchPad {
 int[][] floor;
public SketchPad(int row, int column){
        floor =new int[row][column];
    }

    public int[][] getFloor() {
        return floor;
    }
    public void display(){
    for (var row : floor){
        for (var column : row) {
            if(column == 1){
                System.out.print("* ");
            }
            else {
                System.out.println(" ");
            }

        }
        System.out.println();
    }
    }
}
