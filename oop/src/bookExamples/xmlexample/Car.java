package bookExamples.xmlexample;

public class Car {
    private String vin;
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String vin,String make,String model,int year,String color){
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
     String str = String.format("VIN: %s, MAKE: %s, MODEL: %s, YEAR: %d, COLOR: %s.\n",vin,make,model,year,color);
        return str;
    }
}
