package Temp;

public class Celsius implements Temperature{
    private double currentTemp;


    public Celsius(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    @Override
    public double convertTemp(){
        return this.currentTemp *9/5+32;
    }
}
