package ChapterTen;

public abstract class Line {
    private  String straigthLine;
    private String curveLine;
    private String verticalLine;

    public Line(String striagthLine, String curveLine, String verticalLine) {
        this.straigthLine = striagthLine;
        this.curveLine = curveLine;
        this.verticalLine = verticalLine;
    }

    public abstract void move();
     abstract void pass();

}
