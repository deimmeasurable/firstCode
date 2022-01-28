package ChapterNine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivingThingTest {
    @Test
    public  void livingAvesBreathingTest(){
        Ave hawk = new Ave("hawk");
        hawk.canBreath();
    }
    @Test
    public void callMethodFromTheParent(){
        Ave bat= new Ave("bat");
        bat.parentMethodCanBreath();
    }
    @Test
    public void howToCallAContructorFromIndirectInheritance(){
        Ave dove = new Ave("dove");
       // no need of creating method just extract from the default construction
    }

}