package ChapterSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetOperationTest {
    SetOperation setOperation;

    @BeforeEach
    void setUp() {
        setOperation = new SetOperation();
    }
    @Test
    void testThatSetOperationIsNotNull(){
        assertNotNull(setOperation);
    }
    @Test
    void testThatSetOperationHasASetAComponent(){
        //given
        setOperation= new SetOperation();
        //when
        setOperation.containListOfSetA(4,5,3);

        //assert
        assertEquals(3,setOperation.countA());

    }
    @Test
    void testThatSetOperationHasASetBComponent() {
        //given
        setOperation = new SetOperation();

        //when
        setOperation.containListOfSetB(7, 8, 3);

        //assert
        assertEquals(3, setOperation.countB());
    }
    @Test
    void testThatSetOperationCanMethodInteraction(){
        //given
        setOperation=new SetOperation();
        //when
//        setOperation.canPerfomInteractionMethod(3);
        Set<Integer> intersect =setOperation.canPerfomInteractionMethod();
        //assert
        assertEquals(3,6, String.valueOf(intersect));
    }
}