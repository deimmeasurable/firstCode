package ChapterNine;

public class Ave extends Animal{

    public Ave(String name) {
        super(name);
    }

    @Override
    public void canBreath(){
    //    super.canBreath();
        System.out.println("I am ave and i can breath");
    }
    public void parentMethodCanBreath(){
        super.canBreath();
    }
}
