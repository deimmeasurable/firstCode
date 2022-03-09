package chapterEight;

public class Student {

    private final Course[] course;

    public Student(Course[] course) {
        this.course = course;

    }


    public Course setCourse(Course course) {
        return course;

    }
}
