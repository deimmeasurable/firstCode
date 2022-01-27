package chapterEight;

import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void studentTest(){
        Course[] course = new Course[4];
        Student student = new Student(course);

        Teacher teacher = new Teacher(student);
    }
    @Test
    public void studentCanRegisterForCourses(){
        Course [] course= new Course[2];
        Student seyiStudent= new Student(course);
        seyiStudent.setCourse();
    }
}
