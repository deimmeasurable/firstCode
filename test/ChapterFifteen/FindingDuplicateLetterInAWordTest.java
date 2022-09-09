package ChapterFifteen;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindingDuplicateLetterInAWordTest {

    @Test
     void  findDuplicateLetterInAWord() {
        String letter="poopoolar";
      String result=  FindingDuplicateLetterInAWord.findDuplicate(letter);

      assertEquals(result, "{p=2, a=1, r=1, l=1, o=4}");

    }
    @Test
    void testThatTotalSumOfArray(){
        int [] value={1,2,3,4,5,6};
        int total=FindingDuplicateLetterInAWord.calculateSum(value);
        assertEquals(total,21);
    }
    @Test
    void testThatMaximumValueCanBeGottenInAnArray(){
        int [] value={1,2,3,4,5,6};
        int maximumValue=FindingDuplicateLetterInAWord.getTheMaximumValue(value);
        assertEquals(maximumValue,6);
    }
    @Test
    void testThatPairOfTwoArrayCanBeUseToGetANumber(){
        int [] value={1,2,3,4,5,6};
        int number= 11;
        String twoPairNumber= FindingDuplicateLetterInAWord.getTwoElementPairOfTwoArray(value, number);

        assertEquals(twoPairNumber,"5,6");
    }
    @Test
    void testThatThreePairNumberCanGiveYouASumOfNumber(){
        int [] value={1,2,3,4,5,6};
        int number=15;
        String threePairNumber= FindingDuplicateLetterInAWord.findTheThreeElementThatWillGiveTheSum(value,number);
        System.out.println(threePairNumber);
        assertEquals(threePairNumber,"4,5,6");
    }
    @Test
    void testThatAnElementCanBeGottenInAnArray(){
        int [] value={1,2,3,4,5,6};
        int number = 3;

        int element=FindingDuplicateLetterInAWord.getTheIndexValueOfAnElement(value,number);

        assertEquals(element,3);

    }
    @Test
    void testThatAnElementInAnArrayCanBeReplace(){
        int [] value={1,2,3,4,5,6};
        int number=8;
//        String replaceValue = new ArrayList<>();
         String replaceValue= Arrays.toString(FindingDuplicateLetterInAWord.replaceAnElementValueInAnArray(value, number));
        System.out.println(Arrays.toString(value));
        assertEquals(replaceValue, "[1, 2, 3, 8, 5, 6]");

    }
    @Test
    void testThatAnWordIsAPalindrome(){
        String word = "enter into the deep ride";

        boolean collect= FindingDuplicateLetterInAWord.checkIfAWordIsAPanlindrome(word);
        assertTrue(collect,"it a palindrome");


    }
    @Test
    void testThatFirstLetterIsACapitalized(){
        String word="the boy is riding on a bicycle";

        String convertFirstLetter=FindingDuplicateLetterInAWord.capitalizedtheFirstLetter(word);
        System.out.println(convertFirstLetter);

        assertEquals(convertFirstLetter,"The boy is riding on a bicycle");
    }

    }
