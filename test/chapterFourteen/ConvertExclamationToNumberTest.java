package chapterFourteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConvertExclamationToNumberTest {
    ConvertQuestionToNumber convertQuestionToNumber;

    @BeforeEach
    void setup(){
        convertQuestionToNumber=new ConvertQuestionToNumber();
    }
    @Test
    void testThatConvertExclamationToNumberIsNotNull(){
        assertNotNull(convertQuestionToNumber);
    }
    @Test
    void testThatQuestionMarKCanBeConverted(){
      String number=  convertQuestionToNumber.changeQuestionMarkToNumber("?");
        assertEquals("1",number);
    }




}