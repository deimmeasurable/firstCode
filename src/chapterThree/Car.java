package chapterThree;//package chapterThree;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String Model, String Year, double Amount ){
        model = Model;
        year = Year;
        price = Amount;
    }

    public void setModel(String Model){
        model =Model;
    }
    public void setYear(String Year){
        year = Year;
    }
    public void setPrice(double price){
        price = price;
    }
    public String getModel(){

        return model;
    }
    public String getYear(){
        return year;
    }
    public double getprice(){
        return price;
    }
}



