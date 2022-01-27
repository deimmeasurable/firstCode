package chapterEight;

import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.junit.jupiter.api.Assertions.*;

class ParentTest {
    @Test
    public void nameOfParent(){
        Child child = new Child("Lolo", 25);
        Parent otunbs=new Parent("Otunba", child);

        assertEquals("Otunba",otunbs.getName());
    }

}