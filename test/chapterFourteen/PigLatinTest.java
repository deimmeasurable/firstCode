package chapterFourteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    PigLatin pigLatin;
    @BeforeEach
    void setUp() {
        pigLatin = new PigLatin();
    }
    @Test
    void printTheWord(){
        PigLatin pigLatin = new PigLatin();
        String word = pigLatin.createPiglatinWord("jump");
        assertEquals("umpjay",word);
    }
    @Test
    void printAAsSentenceAsPigLatin(){

    }
}