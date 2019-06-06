package firstApp;

public class LbToOzConverter implements Converter {
    @Override
    public long convert(long value) {
        return value*=16;
    }
}
