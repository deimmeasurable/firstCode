package ChapterEleven;

public class Attempt{
    private TicTacToeBoard gameIndexValue;
    private TicTacToePlayer player;
    private  String gameIndex;
    public TicTacToePlayer getPlayer() {
        return player;
    }

    public void setPlayer(TicTacToePlayer player) {
        this.player = player;
    }

    public String getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(String gameIndex) {
        this.gameIndex = gameIndex;
    }



    public TicTacToeBoard getGameIndexValue() {
        return gameIndexValue;
    }

    public void setGameIndexValue(TicTacToeBoard gameIndexValue) {
        this.gameIndexValue = gameIndexValue;
    }


//    private String[] playerOneInput=new String[4];
//    private String[] playerTwoInput=new String[4];


//    public String[] getPlayerOneInput() {
//        return playerOneInput;
//    }
//
//    public void setPlayerOneInput(String[] playerOneInput) {
//        this.playerOneInput = playerOneInput;
//    }
//
//    public String[] getPlayerTwoInput() {
//        return playerTwoInput;
//    }
//
//    public void setPlayerTwoInput(String[] playerTwoInput) {
//        this.playerTwoInput = playerTwoInput;
//    }

}
