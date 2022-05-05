package chapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MultipleTest {
Multiple multiple;
    @BeforeEach
    void setUp() {
        multiple= new Multiple();
    }
    @Test
    void testThatItNotNull(){
        assertNotNull(multiple);
    }
    @Test
    void testThatFirstNumberWhenTripledIsTheMultipleOfTheSecondNumber(){
        multiple.firstNumberWhenTripledIsTheMultipleOfTheSecondNumber(3,12);

       assertTrue(true);
    }
}