package ChapterTen;

public class Human implements Moveable,flyable{
    @Override
    public void move() {
        System.out.println("Dog walk");
    }

    @Override
    public void canFly() {
        System.out.println("i can fly higher");
    }
}
