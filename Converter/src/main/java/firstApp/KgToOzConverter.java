package firstApp;

public class KgToOzConverter implements Converter{
    @Override
    public long convert(long value) {
        return value*=35.2739619;
    }
}
