package ChapterEleven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;

    @BeforeEach
    public void setup() {
//        ticTacToe = new TicTacToe("playerOne");
    }

    @Test
    public void checkThatTictactoeExistTest() {
//        ticTacToe = new TicTacToe("playerOne");
//        ticTacToe.checkIfItExist();
//        assertTrue(ticTacToe.checkIfItExist());

    }

    @Test
    public void checkThatTictactoeIsNotEmptyTest() {
//        ticTacToe = new TicTacToe("playerOne");
//        assertNotNull(ticTacToe);
    }

    @Test
    public void testThatEnumValueHasElementEmpty() {
        TicTacToeBoard empty = TicTacToeBoard.EMPTY;
        assertNotNull(empty);
    }

    @Test
    public void testThatEnumValueHasElementX() {
        TicTacToeBoard x = TicTacToeBoard.X;
        assertNotNull(x);
    }

    @Test
    public void testThatEnumValueHasElementO() {
        TicTacToeBoard o = TicTacToeBoard.O;
        assertNotNull(o);

    }

    @Test
    public void testThatTictacToeHasAPlayer() {
//        ticTacToe = new TicTacToe("playerOne");
//        ticTacToe.setPlayer("playerOne");
//        assertEquals("playerOne", ticTacToe.getPlayer());
    }

    @Test
    public void testThatTicTacToeHasMoreThanOnePlayer() {
//        ticTacToe = new TicTacToe("playerOne");
//        ticTacToe.setPlayer("playerOne");
//        ticTacToe.setPlayer("playerTwo");
//        assertEquals("playerTwo", ticTacToe.getPlayer());
    }
    @Test
    public void CollectPlayerInputAndIndex(){
        TicTacToePlayer playerOne=new TicTacToePlayer();
//        playerOne.collectEachUserInput();
    }
}