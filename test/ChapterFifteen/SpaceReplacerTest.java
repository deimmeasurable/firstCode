package ChapterFifteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceReplacerTest {

    @Test
    void testReplaceString(){
        String word = "The boy is good ";
        String result = SpaceReplacer.replaceString(word);
        assertEquals(result, "The%boy%is%good");
    }
    @Test
    void testThatDuplicateLetterCanBeFound(){

    }

}