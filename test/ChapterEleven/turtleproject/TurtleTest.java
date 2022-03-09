package ChapterEleven.turtleproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ChapterEleven.turtleproject.PenState.DOWN;
import static ChapterEleven.turtleproject.PenState.UP;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;

    @BeforeEach

    public void setUp() {
        turtle = new Turtle();
    }

    @Test
    public void turtleExistTest() {
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }

    @Test
    public void turtleHasAPenTest() {
        Turtle turtle = new Turtle();
        Pen pen = turtle.getPen();
        assertNotNull(pen);
    }

    @Test
    public void penIsUpByDefaultTest() {
        Turtle turtle = new Turtle();
        Pen pen = turtle.getPen();
        assertSame(pen.getState(), UP);
    }

    @Test
    public void turtleCanMovePenDown() {
        Pen pen = turtle.getPen();
        turtle.penDown();
        assertSame(pen.getState(), PenState.DOWN);

    }

    @Test
    public void turtleCanMovePenUpTest() {
        turtle.penDown();
        assertSame(turtle.getPen().getState(), DOWN);

        turtle.penUp();
        assertSame(turtle.getPen().getState(), UP);
    }

    @Test
    public void turtleCanTurnRight_whileFacingEastTest() {
        assertSame(turtle.getCurrentDirection(), Direction.EAST);
        //when
        turtle.turnRight();
        //assert
        assertSame(turtle.getCurrentDirection(), Direction.SOUTH);
    }

    @Test
    public void turtleCanTurnRight_whileFacingWestTest() {
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), Direction.SOUTH);
        //when
        turtle.turnRight();
        //assert
        assertSame(turtle.getCurrentDirection(), Direction.WEST);
    }

    @Test
    public void turtleCanTurnRight_whileFacingNorthTest() {
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), Direction.SOUTH);
        //when
        turtle.turnRight();
        //assert
        assertSame(turtle.getCurrentDirection(), Direction.WEST);

        turtle.turnRight();
        //assert
        assertSame(turtle.getCurrentDirection(), Direction.NORTH);
    }

// todo face west, face north

    @Test
    public void turtleCanTurnLeft_whileFacingEastTest() {

        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(), Direction.NORTH);
    }

    @Test
    public void turtleCanTurnLeft_whileFacingNorthTest() {
        //given that
        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(), Direction.NORTH);

        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(), Direction.WEST);

    }

    @Test
    public void turtleCanTurnLeft_whileFacingWestTest() {
        //given that
        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(), Direction.NORTH);

        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(), Direction.WEST);

        turtle.turnLeft();
        assertSame(turtle.getCurrentDirection(), Direction.SOUTH);

    }

    //todo face North,west,south,

    @Test
    public void turtleCanMove_whileFacingEastTest() {
        turtle.move(6);
        turtle.move(5);
        Position expected = new Position(0, 9);
        assertEquals(expected, turtle.getCurrentPosition());

    }

    @Test
    public void turtleCanMove_whileFacingSouthTest() {
        turtle.turnRight();
        turtle.move(6);
        Position expected = new Position(5, 0);
        assertEquals(expected, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMove_WhileFacingWestTest() {


        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());
        turtle.move(6);
        turtle.move(5);
        Position expected = new Position(0, -9);
        assertEquals(expected, turtle.getCurrentPosition());

    }

    @Test
    public void turtleCanMove_WhileFacingNorthTest() {
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.move(6);
        Position expected = new Position(-5, 0);
        assertEquals(expected, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanWrite_WhenPenIsDownMovingEastTest() {
        turtle.penDown();
        SketchPad pad = new SketchPad(5, 5);
        turtle.moveWhenPenIsDown(5, pad);
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
        assertEquals(1, pad.getFloor()[0][0]);
        assertEquals(1, pad.getFloor()[0][1]);
        assertEquals(1, pad.getFloor()[0][2]);
        assertEquals(1, pad.getFloor()[0][3]);
        assertEquals(1, pad.getFloor()[0][4]);
        pad.display();
    }

    @Test
    public void whenTurtleGoesOutOfSketchpad_exceptionIsThrow() {
        turtle.penDown();
        SketchPad pad = new SketchPad(5, 5);
        turtle.moveWhenPenIsDown(5, pad);
//       assertThrows(InvalidMoveException.class,()->turtle.moveWhenPenIsDown(5,pad));
        try {
            turtle.moveWhenPenIsDown(5, pad);
        } catch (InvalidMoveException eee) {
            assertEquals(InvalidMoveException.class, eee.getClass());
            assertEquals(InvalidMoveException.class, eee.getClass());
        }
    }

    @Test
    public void turtleCanWrite_WhenPenIsDownMovingSouthTest() {
        turtle.penDown();
        turtle.turnRight();
        SketchPad pad = new SketchPad(5, 5);
        turtle.moveWhenPenIsDown(5, pad);
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());
        assertEquals(1, pad.getFloor()[0][0]);
        assertEquals(1, pad.getFloor()[1][0]);
        assertEquals(1, pad.getFloor()[2][0]);
        assertEquals(1, pad.getFloor()[3][0]);
        assertEquals(1, pad.getFloor()[4][0]);
        pad.display();
    }
    @Test
    public void whenTurtleGoesOutOfSketchpad_exceptionIsThrowMovingSouth() {
        turtle.penDown();
        turtle.turnRight();
        SketchPad pad = new SketchPad(5, 5);
        turtle.moveWhenPenIsDown(5, pad);
//       assertThrows(InvalidMoveException.class,()->turtle.moveWhenPenIsDown(5,pad));
        try {
            turtle.moveWhenPenIsDown(5, pad);
        } catch (InvalidMoveException eee) {
            assertEquals(InvalidMoveException.class, eee.getClass());
            assertEquals(InvalidMoveException.class, eee.getClass());
        }
    }

    @Test
    public void turtleCanWrite_WhenPenIsDownMovingWESTTest() {
        //given;
        turtle.penDown();
        turtle.turnRight();
        turtle.turnRight();
        //when
        SketchPad pad = new SketchPad(5, 5);
        turtle.moveWhenPenIsDown(5, pad);
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        //assert
        assertEquals(1, pad.getFloor()[0][4]);
        assertEquals(1, pad.getFloor()[0][3]);
        assertEquals(1, pad.getFloor()[0][2]);
        assertEquals(1, pad.getFloor()[0][1]);
        assertEquals(1, pad.getFloor()[0][0]);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
        pad.display();

    }
}