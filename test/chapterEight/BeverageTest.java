package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {
    @Test
    public void defaultyArgTest(){
        Beverage beverage=new Beverage();
        assertEquals(0,beverage.getCocoaQuantity());
        assertEquals(0,beverage.getMilkQuantity());
        assertEquals(0,beverage.getSugarQuantity());
    }
    @Test
    public void allArgsTest(){

        Beverage cowbellChoco = new Beverage(2, 4,6);
        assertEquals(2,cowbellChoco.getCocoaQuantity());
        assertEquals(8,cowbellChoco.getSugarQuantity());
    }
    @Test
    public void milkOnlyRequiredTest(){
        Beverage cowbellChoco = new Beverage(3);
        assertEquals(3,cowbellChoco.getMilkQuantity());
        assertEquals(0,cowbellChoco.getCocoaQuantity());
    }


}