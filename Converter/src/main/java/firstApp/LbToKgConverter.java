package firstApp;

public class LbToKgConverter implements Converter {
    @Override
    public long convert(long value) {
        return value*=0.45359237;
    }
}
