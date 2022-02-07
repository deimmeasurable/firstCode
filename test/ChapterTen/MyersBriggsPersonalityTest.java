package ChapterTen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyersBriggsPersonalityTest {
    MyersBriggsPersonality person;
    @BeforeEach
    public void setUp(){
        person=new MyersBriggsPersonality();

    }
    @Test
    public void checkIfTheMyersBriggsTest(){
        assertNotNull(person);
    }
    @Test
    public void checkIfUsersExistsTest(){
        person.asAUser();
        assertTrue(person.asAUser());
    }
    @Test
    public void myersBriggsPersonalityAsOneUser(){
        person.setUser("funke");
        assertEquals("funke",person.getUser());

    }
    @Test
    public void userCanAttemptQuestionsTest(){
        person.canAttemptQuestion(){

        }
    }


}