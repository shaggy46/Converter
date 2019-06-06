package firstApp;

public class OzToLbConverter implements Converter {
    @Override
    public long convert(long value) {
        return value*=0.0625;
    }
}
