package firstApp;

public class OzToKgConverter implements Converter {
    @Override
    public long convert(long value) {
        return value*=0.0283495231;
    }
}
