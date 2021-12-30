// chapterSeven;
import chapterSeven.Bike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike suzuki;
    @BeforeEach
    public void startWithThis(){

        suzuki = new Bike("power bike");


    }
    @Test
    public void checkThatBikeIsOnDefaultWhenIsCreated(){
        assertEquals("power bike",suzuki.getName());
        assertFalse(suzuki.isOn());
      assertEquals(0, suzuki.getSpeed());
    }
    @Test
    public void checkIfBikeIsTurnOn(){
        suzuki.setOn(true);
        assertTrue(suzuki.isOn());
    }
    @Test
    public void checkIfBikeCanTurnOff(){
        //Given
        suzuki.setOn(true);
        //when
        suzuki.setOn(false);
        //assert
        assertFalse(suzuki.isOn());
    }
    @Test
    public void BikeCanChangeName(){
        //Given
        suzuki.isOn();
        //when
        suzuki.changeName();
        assertEquals("power bike",suzuki.getName());
    }
        @Test
    public void BikeIsAtGearOneWhenIsOn(){
        //Given that
             suzuki.setOn(true);
             //when
            suzuki.getGear();
            //assert
            assertEquals(1,suzuki.getGear());
        }

        @Test
    public void whenBikeIsOffGearIsZero(){
        //Given
            suzuki.isOff();
            //When
            suzuki.setGear();
            //assert
            assertEquals(0,suzuki.getGear());
        }
@Test
    public  void canSetBikeSpeed(){
        //given
        suzuki.isOn();
        //when
    suzuki.setSpeed(10);
    //
    assertEquals(10,suzuki.getSpeed());
}
        @Test
    public  void BikeAccelerationIsZeroWhenIsOff(){
        //given
        suzuki.setOn(false);
        //when
            suzuki.accelerate();
            //assert
            assertEquals(0,suzuki.accelerate());
        }
        @Test
    public void BikeCanAccelerateByOneWhenIsOn(){
        //given that
        suzuki.setOn(true);
        //when
            suzuki.accelerate();
            //assert
            assertEquals(1, suzuki.getGear());
            //assertEquals(1,suzuki.getSpeed());
        }
        @Test
    public void BikeAccelerateByTwoWhenIsOn(){
        //given that
            suzuki.setOn(true);
            // when
            for (int i =0;i<20; i++) {

                suzuki.accelerate();
            }
           assertEquals(20,suzuki.getSpeed());
        }

}
