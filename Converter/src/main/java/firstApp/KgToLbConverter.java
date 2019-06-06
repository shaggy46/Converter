package firstApp;

public class KgToLbConverter implements Converter {

    @Override
    public long convert(long value) {
        return value*=2.20462262;
    }
}
