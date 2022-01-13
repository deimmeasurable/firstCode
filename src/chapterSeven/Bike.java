
package chapterSeven;
public class Bike {

    private String name;
    private boolean isOn;
    private boolean isOff;
    private int speed;
    private int gear;

    public Bike(String name) {
        this.name = name;
        this.isOn = isOn;
        speed = 0;
        gear = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOff() {
        return isOff;
    }

    public void setOff(boolean off) {
        isOff = off;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speedValue) {
        this.speed = speedValue;
    }

    public String changeName() {
        return name;
    }

    public int getGear() {
        if(isOn) {
            if (speed >= 0 && speed <= 20) {
                gear = 1;
            }
            if (speed > 20 && speed <= 30) {
                gear = 2;
            }
        }
        return gear;
    }

    public int accelerate() {
        if(isOn){
            if(speed >=0 && speed <=20){
                speed +=1;
            }
            if(speed >20 && speed <=30) {
                speed +=2;
            }
            if(speed >30 && speed <=40) {
                speed += 3;
            }
            if(speed > 40){
                speed +=4;
            }
        }
        return speed;
    }


    public void setGear() {
        if (isOn){
            gear=1;

        }


    }
}