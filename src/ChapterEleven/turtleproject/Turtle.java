package ChapterEleven.turtleproject;

public class Turtle {
    private Pen biro = new Pen();
    private Direction currentDirection = Direction.EAST;
    private Position currentPosition = new Position(0, 0);
    private String[][] turtleWrite = new String[5][5];

    public Pen getPen() {
        return biro;
    }

    public void penDown() {
        biro.setState(PenState.DOWN);
    }

    public void penUp() {
        biro.setState(PenState.UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == Direction.EAST) face(Direction.SOUTH);
        else if (currentDirection == Direction.SOUTH) face(Direction.WEST);
        else if (currentDirection == Direction.WEST) face(Direction.NORTH);


    }


    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {

        if (currentDirection == Direction.EAST) face(Direction.NORTH);
        else if (currentDirection == Direction.NORTH) face(Direction.WEST);
        else if (currentDirection == Direction.WEST) face(Direction.SOUTH);


    }

    public void move(int numberOfSteps) {
        if (currentDirection == Direction.EAST) increaseColumnBy(numberOfSteps - 1);
        else if (currentDirection == Direction.SOUTH) increaseRowBy(numberOfSteps - 1);
        else if (currentDirection == Direction.WEST) decreaseColumnBy(numberOfSteps - 1);
        else if (currentDirection == Direction.NORTH) decreaseRowBy(numberOfSteps - 1);


    }

    private void decreaseRowBy(int decrease) {
        currentPosition.setRow((currentPosition.getRow() - decrease));
    }

    private void decreaseColumnBy(int decrease) {
        currentPosition.setColumn((currentPosition.getColumn() - decrease));
    }

    private void increaseRowBy(int increase) {
        currentPosition.setRow((currentPosition.getRow() + increase));
    }

    private void increaseColumnBy(int increase) {
        currentPosition.setColumn((currentPosition.getColumn() + increase));
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveWhenPenIsDown(int noOfStep, SketchPad pad) {
        validateMove(noOfStep, pad);
        if (biro.getState().equals(PenState.DOWN)) {
            write(noOfStep, pad);
            //write
        }
        move(noOfStep);
    }

    private void validateMove(int noOfStep, SketchPad pad) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch (currentDirection) {
            case EAST -> {
                int newMove = column + noOfStep;
                int sketchPadColumnLength = pad.getFloor()[row].length;
                if (row + noOfStep > pad.getFloor().length) ;
                if (newMove > sketchPadColumnLength) throw new InvalidMoveException("turtle don fall");
            }
            case SOUTH -> {
                int newMove = row + noOfStep;
                int sketchPadRowLength = pad.getFloor()[column].length;
                if (column + noOfStep > pad.getFloor().length) ;
                if (newMove > sketchPadRowLength) throw new InvalidMoveException("turtle don fall");
            }

        }
    }

    private void write(int noOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        switch (currentDirection) {

            case EAST -> {
                for (int i = column; i < column + noOfSteps; i++) {
                    floor[row][i] = 1;

                }
            }
            case SOUTH -> {
                for (int i = row; i < row + noOfSteps; i++) {
                    floor[i][column] = 1;
                }
            }
            case WEST -> {
                for (int i = column; i < column - noOfSteps; i++) {
                    floor[row][i] = 1;
                }
            }
        }
    }
}





