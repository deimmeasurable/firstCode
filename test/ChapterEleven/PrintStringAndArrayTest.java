package ChapterEleven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintStringAndArrayTest {
PrintStringAndArray printStringAndArray;
    @BeforeEach
    void setUp() {
        printStringAndArray= new PrintStringAndArray();
    }
    @Test
    void testThatPrintStringAndArrayExist(){
        assertNotNull(printStringAndArray);
    }
    @Test
    void testThatTheWordAndTheArrayCanBeConcatenated(){
        printStringAndArray.sayHello("Hello, [name]!");
        assertEquals("Hello, [name]!",printStringAndArray.getName());
    }
}