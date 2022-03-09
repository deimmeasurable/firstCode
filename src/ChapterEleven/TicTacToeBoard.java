package ChapterEleven;

public enum TicTacToeBoard {
    EMPTY,
    X,
    O;

    @Override
    public String toString() {
        switch(this){
            case EMPTY -> {return "EMPTY";}
            case X -> {return "X";}
            case O -> {return "O";}
        }
        return "TicTacToeBoard{}";
    }

}
