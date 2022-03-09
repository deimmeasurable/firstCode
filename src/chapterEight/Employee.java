package chapterEight;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private int salary;
    private Date dateHired;

    public Employee(String name, String address, String phone, String email) {
        super(name, address, phone, email);
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
  public void canTrainPeople(){
        System.out.println("i am an employee and i can teach student");
    }
    public void callAMethodFromTheSuperClass(){
        super.canTrainPeople();
    }
}
