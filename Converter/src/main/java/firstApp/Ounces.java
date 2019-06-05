package firstApp;

public class Ounces {
    double value;

    public Ounces(double value){
        this.value = value;
    }
    double ouncesToKilograms(){
        value*=0.0283495231;
        return value;
    }
    double ouncesToPounds(){
        value *=0.0625;
        return value;
    }
}
