package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder container;

    @BeforeEach
    public void setup() {
        container = new Cylinder(1, 1);

    }

    @Test
    public void testThatDefaultRadiusAndHeightIs1(){
        assertEquals(1, container.getRadius());
        assertEquals(1, container.getHeight());
    }


   @Test
    public void checkThatCylinderExists(){
       assertNotNull(container);
   }

//   @Test
//    public void checkIfCylinderIsNull(){
//        container.checkIfCylinderHasValue();
//        assertFalse(container.checkIfCylinderHasValue());
//   }

   @Test
    public void cyclinderCanHaveValue(){
        container.canHaveValue();
        assertTrue(container.canHaveValue());
   }
   @Test
    public void testThatcylinderHaveARadius(){
        container.setRadius(5);
        assertEquals(5,container.getRadius());
        container.setRadius(10);
        assertEquals(10, container.getRadius());

   }
   @Test
    public void cylinderRadiusCanHaveADefaultValueOfOne(){
       // container.getRadius();
        //assertEquals(0,container.getRadius());
      container.canHaveADefaultValueOfOne();

       assertEquals(1,container.getRadius());

   }
   @Test
    public void cylinderHeightCanHAveADefaultValueOfOne(){
        container.heightCanHaveDefaultValueOfOne();
        assertEquals(1,container.getHeight());
   }
   @Test
    public void cylinderCanHaveAVolume(){
        container.canAVolume();
        assertTrue(container.canAVolume());


   }
   @Test
    public void CanCalculateTheValueOfCylinderVolume(){
        container.calculateTheVolumeOfCylinder();
        assertEquals(6,container.getVolume());
   }

}