package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {
    SavingAccount saver1;
    SavingAccount saver2;

    @BeforeEach
    public void setup() {
        saver1 = new SavingAccount();
        saver2 = new SavingAccount();
    }

    @Test
    public void checkIfSavingAccountExit() {
        saver1.checkIfSavingAccountExit();
        assertTrue(saver1.checkIfSavingAccountExit());
        saver2.checkIfSavingAccountExit();
        assertTrue(saver2.checkIfSavingAccountExit());
    }

    @Test
    public void checkIfSavingAccountCanHaveAValue() {
        saver1.isAnAccountHolder();
        assertTrue(saver1.isAnAccountHolder());
        saver2.isAnAccountHolder();
        assertTrue(saver2.isAnAccountHolder());

//    }
//    @Test
//    public void

    }
}