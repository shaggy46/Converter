package firstApp;

public class Kilograms {
    double value;

    public Kilograms(double value)
    {
        this.value  = value;
    }
    double kilogramsToPounds(){
        value *= 2.20462262;
        return value;
    }
    double kilogramsToOunces(){
        value*=35.2739619;
        return value;
    }
}