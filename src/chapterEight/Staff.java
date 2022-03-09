package chapterEight;

public class Staff extends Person {
    private String title;


    public Staff(String name, String address, String phone, String email) {
        super(name, address, phone, email);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
