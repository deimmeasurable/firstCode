package ChapterEleven;

import ChapterEleven.AtmbankValidation.AtmTypesValidation;
import ChapterEleven.AtmbankValidation.CardType;
import ChapterEleven.AtmbankValidation.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmTypesValidationTest {
    AtmTypesValidation atm;

    @BeforeEach
    public void setup() {
        atm = new AtmTypesValidation();
    }

    @Test
    public void checkIfAtmTypesValidationExistTest() {
        atm = new AtmTypesValidation();
        atm.checkIfAtmExist();
        assertTrue(atm.checkIfAtmExist());
    }

    @Test
    public void CheckIfAtmIsNotNullTest() {
        atm = new AtmTypesValidation();
        assertNotNull(atm);
    }

    @Test
    public void AtmHasAUserTest() {
        atm = new AtmTypesValidation();
        User person = atm.getUser();
        assertNotNull(person);
}


    @Test
    public void AtmHasCardType_VisaCardTest() {
        atm = new AtmTypesValidation();
        atm.setAtmNumber("4234567891011");
       CardType cardType = CardType.VISA_CARD ;
        assertSame(cardType,atm.getCurrentCard());
    }
    @Test
    public void AtmHasCardType_Master_CardTest() {
        //given
        atm = new AtmTypesValidation();
        atm.setAtmNumber("5234567891011");
        CardType cardType = CardType.MASTER_CARD;

        assertSame(cardType, atm.getCurrentCard());

    }
    @Test
    public void AtmHasCardType_American_Express_CardTest() {
        //given
        atm = new AtmTypesValidation();
        atm.setAtmNumber("3734567891011");
        CardType cardType = CardType.AMERICAN_EXPRESS_CARDS;
        assertSame(cardType, atm.getCurrentCard());

    }
    @Test
    public void AtmHasCardType_Discover_CardTest() {
        //given
        atm = new AtmTypesValidation();
        atm.setAtmNumber("6734567891011");
        CardType cardType = CardType.DISCOVER_CARD;
        assertSame(cardType, atm.getCurrentCard());

    }


        @Test
    public void test_tha_atm_has_numbers() {
        atm = new AtmTypesValidation();
        atm.setAtmNumber("1234567891011");
        assertEquals("1234567891011", atm.getAtmNumber());

    }


    @Test
    public void test_tha_atm_has_numbers_size() {
        atm = new AtmTypesValidation();
        atm.setAtmNumber("1234567891011");
        assertEquals(13, atm.getSize());
    }

    @Test
    void test_that_number_cannot_be_less_than_13_throws_exception() {
        atm = new AtmTypesValidation();
//        atm.setAtmNumber("123456789101");

        assertThrows(IllegalArgumentException.class, () -> atm.setAtmNumber("123456789101"));
    }

    @Test
    void test_that_number_cannot_be_greater_than_16_throws_exception() {
        atm = new AtmTypesValidation();
//        atm.setAtmNumber("123456789101");

        assertThrows(IllegalArgumentException.class, () -> atm.setAtmNumber("12345678910195643"));
    }

    @Test
    void test_that_secondDigit_from_right_to_left_for_odd_digit() {
        atm = new AtmTypesValidation();
        atm.setAtmNumber("1234567891013");
        assertEquals("118642", atm.getSecondDigitFRomRight());
    }

    @Test
    void test_that_secondDigit_from_right_to_left_for_even_digit() {
        atm = new AtmTypesValidation();
        atm.setAtmNumber("12345678910138");
        assertEquals("3097531", atm.getSecondDigitFRomRight());
    }

    @Test
    void test_that_secondDigit_from_right_to_left_for_odd_digit_sum() {
        atm = new AtmTypesValidation();
        atm.setAtmNumber("1234567891013");
        assertEquals("26", atm.getSumOfOddDigit());


    }

    @Test
    void test_that_secondDigit_from_right_to_left_for__Even_digit_sum() {
        atm = new AtmTypesValidation();
        atm.setAtmNumber("12345678910138");
        assertEquals("29", atm.getSumOfEvenDigit());
    }
    @Test
    void test_sumOfOddNumber_And_SumEvenNumber_can_Be_Added(){
        atm=new AtmTypesValidation();

//        atm.setAtmNumber("1234567891013");
//        assertEquals("26", atm.getSumOfOddDigit());

        atm.setAtmNumber("12345678910138");
//        assertEquals("29", atm.getSumOfEvenDigit());

        assertEquals(21, atm.getSumOfOddDigit());
        assertEquals("55",atm.getSumOfEvenAndSumOfOddNumber());
    }
}
