package Temp;

public class Fahrenheit implements Temperature{

    private double currentTemp;


    public Fahrenheit(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    @Override
    public double convertTemp(){
        return (this.currentTemp-32)*5/9;
    }
}
