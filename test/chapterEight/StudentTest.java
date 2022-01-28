package chapterEight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private Student student;
    @Test
    public void studentTest()throws Exception{
        Course[] course = new Course[4];
        Student student = new Student(course);
        Teacher teacher = new Teacher(student);
    }
    @Test
    public void studentCanRegisterForCourses() throws Exception{
        Course [] course= new Course[2];
        Student seyiStudent= new Student(course);
        seyiStudent.setCourse(course[1]);


    }
}
