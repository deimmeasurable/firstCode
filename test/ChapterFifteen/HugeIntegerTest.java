package ChapterFifteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HugeIntegerTest {
private HugeInteger hugeInteger;
    @BeforeEach
    void setUp() {
        hugeInteger = new HugeInteger();
    }
    @Test
    void testThatSizeOfArrayEqualsToAVariable(){

        int [] array = new int[40];
        String number ="333300000000000000000000000000000000000";
    String result = String.valueOf(hugeInteger.isEqualto(array, number));


      assertEquals(result, "40");
    }
}