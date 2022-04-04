package ChapterSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDuplicateWordTest {
    CountDuplicateWord countDuplicateWord;

    @BeforeEach
    void setUp() {
        countDuplicateWord= new CountDuplicateWord();
    }
    @Test
    void testThatCountDuplicateWordIsNotNull(){
        assertNotNull(countDuplicateWord);
    }
    @Test
    void testThatThereIsDuplicateWord(){
        countDuplicateWord.checkTheOccurrenceOfDuplicateWord();
        assertEquals(2,countDuplicateWord.getFrequency());
    }
}