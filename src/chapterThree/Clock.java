package chapterThree;

public class Clock {
    private String name;
    private int number;
    private double average;

    public Clock(String name, int number, double average) {
        this.name = name;
        this.number = number;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
