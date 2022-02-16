package ChapterEleven.turtleproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ChapterEleven.turtleproject.PenState.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
   @BeforeEach

      public void setUp(){
       turtle=new Turtle();
   }
    @Test
    public void turtleExistTest(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test
    public void turtleHasAPenTest(){
        Turtle turtle = new Turtle();
        Pen pen = turtle.getPen();
        assertNotNull(pen);
    }
    @Test
    public void penIsByDefaultTest(){
        Turtle turtle = new Turtle();
        Pen pen =turtle.getPen();
        assertSame(pen.getState(), UP);
    }
    @Test
    public void turtleCanMovePenDown(){
        Pen pen =turtle.getPen();
        turtle.penDown();
        assertSame(pen.getState(),PenState.DOWN);

    }
    @Test
    public void turtleCanMovePenUpTest(){
       turtle.penDown();
       assertSame(turtle.getPen().getState(),DOWN);

       turtle.penUp();
       assertSame(turtle.getPen().getState(),UP);
    }
    @Test
    public void turtleCanTurnRight_whileFacingEastTest(){
       assertSame(turtle.getCurrentDirection(), Direction.EAST);
       //when
       turtle.turnRight();
        //assert
       assertSame(turtle.getCurrentDirection(), Direction.SOUTH);
    }
    @Test
    public void turtleCanTurnRight_whileFacingWestTest(){
       turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), Direction.SOUTH);
        //when
        turtle.turnRight();
        //assert
        assertSame(turtle.getCurrentDirection(),Direction.WEST);
    }
    public void turtleCanTurnRight_whileFacingNorthTest(){
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), Direction.SOUTH);
        //when
        turtle.turnRight();
        //assert
        assertSame(turtle.getCurrentDirection(),Direction.WEST);

        turtle.turnRight();
        //assert
        assertSame(turtle.getCurrentDirection(),Direction.NORTH);
    }

// todo face west, face north

    @Test
    public void turtleCanTurnLeft_whileFacingEastTest(){
       turtle.turnLeft();
       assertSame(turtle.getCurrentDirection(),Direction.NORTH);
    }
    //todo face North,west,south,

    @Test
    public void  turtleCanMove_whileFacingEastTest(){
       turtle.move(6);
       turtle.move(5);
       Position expected = new Position(0, 9);
       assertEquals(expected,turtle.getCurrentPostion());

    }
    @Test
    public void turtleCanMove_whileFacingSouthTest(){
       turtle.turnRight();
        turtle.move(6);
        Position expected = new Position(5, 0);
        assertEquals(expected,turtle.getCurrentPostion());
    }
}