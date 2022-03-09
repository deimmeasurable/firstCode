package selfPractise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerArithmeticTest {
    int firstNumber;
    int secondNumber;
    int sum;

    @BeforeEach
    void setUp(){
        this.firstNumber = ComputerArithmetic.generateFirstNumberRandomly();
        this.secondNumber = ComputerArithmetic.generateSecondNumberRandomly();
        this.sum = ComputerArithmetic.secretRandomResults(firstNumber,secondNumber);

    }

    @Test
    void additionArithmetiic() {
        int userInput = 1;
        if(sum == userInput){
            String expectedMessage = "Good: you are doing great";
            String actualMessage = ComputerArithmetic.additionArithmetiic(userInput);
            assertTrue(expectedMessage.contains(actualMessage));
        }

    }
}