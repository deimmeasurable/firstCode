package ChapterTen;

public interface Moveable extends flyable {
     void move();

     default void hide(){

     }
}
