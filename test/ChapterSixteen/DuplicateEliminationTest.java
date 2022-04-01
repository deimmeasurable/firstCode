package ChapterSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DuplicateEliminationTest {
    DuplicateElimination duplicateElimination;
@BeforeEach
    public  void setUp(){
        duplicateElimination= new DuplicateElimination();
    }
    @Test
    void testThatItNotNull(){
    DuplicateElimination duplicateElimination= new DuplicateElimination();
    assertNotNull(duplicateElimination);
    }
    @Test
    void testThatListOfFirstNameCanBeCollected(){
     duplicateElimination.collectedFirstName("dele");
    assertEquals(1,duplicateElimination.count());
    }
    @Test
    void testThatMoreFirstNameCanBeCollected(){
    duplicateElimination.collectedFirstName("dele");
    duplicateElimination.collectedFirstName("fola");
    duplicateElimination.collectedFirstName("seyi");
    assertEquals(3,duplicateElimination.count());
    }
    @Test
    void testThatNoDuplicateNames(){
    //given
        duplicateElimination.collectedFirstName("dele");
        duplicateElimination.collectedFirstName("fola");
        duplicateElimination.collectedFirstName("fola");
        duplicateElimination.collectedFirstName("seyi");
        duplicateElimination.collectedFirstName("seyi");

        //when
//    duplicateElimination.checkThatNoDuplicateNames("dele");
//    duplicateElimination.checkThatNoDuplicateNames("seyi");


        //assert
        assertEquals(3,duplicateElimination.count());
        }
    }

