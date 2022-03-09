package ChapterEleven;

import java.util.Arrays;
import java.util.Scanner;

import static ChapterEleven.TicTacToeBoard.*;

public class TicTacToe {
    private static TicTacToeBoard[][] game = new TicTacToeBoard[3][3];

    private void resetGame() {
        for (int row = 0; row < game.length; row++) {
            Arrays.fill(game[row], EMPTY);
        }
    }


    private String printArray() {
        StringBuilder display = new StringBuilder();
        for (TicTacToeBoard[] ticTacToeBoards : game) {
            for (TicTacToeBoard board : ticTacToeBoards) {
                switch (board) {
                    case EMPTY -> display.append(" - ");
                    case X -> display.append(" X ");
                    case O -> display.append(" O ");
                }
            }
            display.append("\n");
        }
        return display.toString();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        int[] collectionFirstPlayerInput = new int[5];
        int[] collectionSecondPlayerInput = new int[5];
        int firstPlayerIndex = 0;
        int secondPlayerIndex = 0;
        displayIndex(" ");
        for (int i = 0; i <= 4; i++) {
            System.out.println("PlayerOne, enter the index of your choice to play");

                firstPlayerIndex = scanner.nextInt();

            if(firstPlayerIndex < 0  || firstPlayerIndex >9) {
                System.out.println("error input");
                System.exit(0);
            }

            fillIndexWithValueXAndOInTicTacToeBoardForPlayerOne(firstPlayerIndex);
            System.out.println(printArray());

            collectionFirstPlayerInput[i] = firstPlayerIndex;
            System.out.println(Arrays.toString(collectionFirstPlayerInput));

            if (checkWinner(game)) {
                System.out.println("Hurray you won, playerOne won");
                return;
            }


        displayIndex(" ");

        System.out.println("PlayerTwo, enter the index of your choice to play");

            secondPlayerIndex = scanner.nextInt();
        if(secondPlayerIndex < 0)

            System.out.println("error input!!! enter a valid input ");

        {
                    fillingOForSecondPlayer(secondPlayerIndex);
                    System.out.println(printArray());
                    collectionSecondPlayerInput[i] = secondPlayerIndex;
                    System.out.println(Arrays.toString(collectionSecondPlayerInput));
                }
            }
                    checkWinner(game);
//                checkWin(game);
                    System.out.println("Hurray you won, playerTwo won");
                }






    private void displayIndex(String message) {
        System.out.println("Enter 1 for index 1, Enter 2 for index 2," +
                "Enter 3 for index 3, Enter 4 for index 4," +
                "Enter 5 for index 5, Enter 6 for index 6, Enter 7 for index 7," +
                "Enter 8 for index 8, Enter 9 for index 9");

    }


    public void fillIndexWithValueXAndOInTicTacToeBoardForPlayerOne(int value) {
        fillPlayerValue(value, X);
    }

    public void fillingOForSecondPlayer(int value) {
        fillPlayerValue(value, O);
    }

    private void fillPlayerValue(int value, TicTacToeBoard fillIndex) {
        switch (value) {
            case 1 -> {
                if (game[0][0].equals(EMPTY)) {
                    game[0][0] = fillIndex;
                }
                else throw new IllegalArgumentException("position is not empty");
            }
            case 2 -> {
                if (game[0][1].equals(EMPTY)) {
                    game[0][1] = fillIndex;
                }
                else throw new IllegalArgumentException("Position is not empty");
            }
            case 3 -> {
                if(game[0][2].equals(EMPTY)) {
                    game[0][2] = fillIndex;
                }
                else throw new IllegalArgumentException("position is not empty");
            }
            case 4 -> {
                if (game[1][0].equals(EMPTY)) {
                    game[1][0] = fillIndex;
                } else throw new IllegalArgumentException("position is not empty");
            }
            case 5 -> {
                if(game[1][1].equals(EMPTY)) {

                    game[1][1] = fillIndex;
                }else throw new IllegalArgumentException("position is not empty");
            }
            case 6 -> {
                if(game[1][2].equals(EMPTY)) {
                    game[1][2] = fillIndex;
                }
                else throw new IllegalArgumentException("position is not empty");
            }
            case 7 -> {
                if(game[2][0].equals(EMPTY)) {
                    game[2][0] = fillIndex;
                }
                else throw new IllegalArgumentException("position is not empty");
            }
            case 8 -> {
                if(game[2][1].equals(EMPTY)) {
                    game[2][1] = fillIndex;
                }
                else throw new IllegalArgumentException("position is not empty");
            }
            case 9 -> {
                if(game[2][2].equals(EMPTY)) {
                    game[2][2] = fillIndex;
                }
                else throw new IllegalArgumentException("position is not empty");
            }


        }

    }

    public boolean checkWin(TicTacToeBoard[][] game) {
        if (checkColumnWin(game)) {
            return true;
        }
        return checkRowWin(game);
    }

    private boolean checkColumnWin(TicTacToeBoard[][] game) {
        for (TicTacToeBoard[] ticTacToeBoards : game) {
            if (!ticTacToeBoards[0].equals(EMPTY) && !ticTacToeBoards[1].equals(EMPTY) && !ticTacToeBoards[2].equals(EMPTY)) {
                return (ticTacToeBoards[0].equals(ticTacToeBoards[1])) && (ticTacToeBoards[1].equals(ticTacToeBoards[2]));
            }
            return false;
        }
        return true;
    }

    private boolean checkRowWin(TicTacToeBoard[][] game) {
        for (int column = 0; column < game.length; ++column) {
            if (!game[0][column].equals(EMPTY) && !game[1][column].equals(EMPTY) && !game[2][column].equals(EMPTY)) {
                return game[0][column].equals(game[1][column]) && game[1][column].equals(game[2][column]);
            }
            return false;
        }
        return false;
    }
    private boolean checkWinner(TicTacToeBoard[][] game) {
        for (int row = 0; row < game.length; ++row) {
            for (int column = 0; column < game[row].length; column++) {
                if (!game[0][0].equals(EMPTY) && !game[0][1].equals(EMPTY) && !game[0][2].equals(EMPTY)){
                    checker();

                    if(!game[1][0].equals(EMPTY) && !game[1][1].equals(EMPTY) && !game[1][2].equals(EMPTY)) {
                        checker();

                        if(!game[2][0].equals(EMPTY) && !game[2][1].equals(EMPTY) && !game[2][2].equals(EMPTY)){

                            return true;
                        }
                    }
                }
            }

        }
        return false;

    }
    private boolean checker(){
        for (int row = 0; row < game.length; row++) {
            for (int column = 0; column < game[row].length; ++column) {
                if( game[row][column].equals(X)){

                }
                    else if(game[row][column].equals(O)){
                    System.out.println("winner the last player won");

                }
                return true;


            }

            System.exit(0);

        }
        return false;
    }

    public boolean checkIfCellIsNotEmpty(int index) {
        for (int row = 0; row < game.length; ++row) {
            for (int column = 0; column < game[row].length; ++column) {
                if (!game[0][column].equals(EMPTY) && !game[1][column].equals(EMPTY) && !game[2][column].equals(EMPTY)) {
                if(game[row][column].equals(X) ||game[row][column].equals(O)){
                    throw new IllegalArgumentException("position is not empty");

                }

                }

                }
            }
        return false;
    }



    public static void main(String[] args) {
        TicTacToe tacToe=new TicTacToe();
        tacToe.resetGame();
        tacToe.getInput();



    }

}

