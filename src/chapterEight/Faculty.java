package chapterEight;

public class Faculty extends Person{
    private String officeHour;
    private String rank;

    public Faculty(String name, String address, String phone, String email) {
        super(name, address, phone, email);
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeHour='" + officeHour + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
