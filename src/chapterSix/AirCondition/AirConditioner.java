package chapterSix.AirCondition;

public class AirConditioner {
private boolean isOn;
    public AirConditioner(String acName) {
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}
