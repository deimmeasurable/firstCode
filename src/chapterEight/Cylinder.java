package chapterEight;

public class Cylinder {
    private int radius;
    private int height;
    private int radiusDefaultValue;
    private int heightDefaultValue;
    private double volume;


    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
        this.volume=volume;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean checkIfCylinderExit() {
        return  true;
    }

    public boolean checkIfCylinderHasValue() {
        return false;
    }

    public boolean canHaveValue() {
        return true;
    }

    public void canHaveADefaultValueOfOne() {
       if (getRadius() == 0){ isNotOne();
          radiusDefaultValue = 1;
           radius = radiusDefaultValue;

       }else if(radiusDefaultValue >1){
           throw new IllegalArgumentException("the value you enter is invalid");
       }
    }

    private boolean isNotOne() {
        if( radiusDefaultValue > 1){
            return false;


       }
        return true;
   }

    public double getVolume() {
        return (int)volume;
    }


    public int heightCanHaveDefaultValueOfOne() {
        if(getHeight()==0){ isNotMoreThanOne();
            heightDefaultValue = 1;
            height =heightDefaultValue;
    }
        return height;
}

    private boolean isNotMoreThanOne() {
        if(heightDefaultValue > 1){
            return false;
        }
        return true;
    }

    public boolean canAVolume() {
        return true;

    }

    public int calculateTheVolumeOfCylinder() {
        volume=Math.PI * radius * 2 * height;
        return (int)volume;
    }
}
