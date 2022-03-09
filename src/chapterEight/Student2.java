package chapterEight;

public class Student2 extends Person{
    private String status;



    public Student2(String name, String address, String phone, String email) {
        super(name, address, phone, email);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "status='" + status + '\'' +
                '}';
    }
}
