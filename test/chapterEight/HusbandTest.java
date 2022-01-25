package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HusbandTest {

    @Test
    public void iyawoDelima(){
        Wife folaWife = new Wife();
        Husband peter = new Husband(folaWife);

        assertEquals(folaWife,peter.getWife());


    }

}