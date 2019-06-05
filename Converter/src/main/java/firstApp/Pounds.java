package firstApp;

public class Pounds {
    double value;

    public Pounds(double value){
        this.value = value;
    }

    double poundsToKilograms(){
        value*=0.45359237;
        return value;
    }
    double poundsToOunces(){
        value *=16;
        return value;
    }

}
