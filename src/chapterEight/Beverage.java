package chapterEight;

public class Beverage {
    private int cocoaQuantity;

    private int sugarQuantity;
    private int milkQuantity;

    public Beverage(int cocoaQuantity, int sugarQuantity, int milkQuantity) {
        this.cocoaQuantity = cocoaQuantity;
        this.sugarQuantity = sugarQuantity * 2;
        this.milkQuantity = milkQuantity;
    }




    public Beverage() {

    }

//   public Beverage(int sugarQuantity) {
//       this.sugarQuantity = 5;
//    }
    public Beverage(int milkQuantity) {
        this(0,milkQuantity);
    }

    public Beverage(int cocoaQuantity,int milkQuantity){
        this.milkQuantity=milkQuantity;
        this.cocoaQuantity=cocoaQuantity;
    }

    public int getCocoaQuantity() {
        return cocoaQuantity;
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    public void setCocoaQuantity(int cocoaQuantity) {
        this.cocoaQuantity = cocoaQuantity;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(int milkQuantity) {
        this.milkQuantity = milkQuantity;
    }
}
