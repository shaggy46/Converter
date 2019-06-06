package firstApp;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    static Map<ConvertMethods,Converter> converters;
    static {
        converters = new HashMap<ConvertMethods,Converter>();
        converters.put(ConvertMethods.KG_TO_LB, new KgToLbConverter());
        converters.put(ConvertMethods.KG_TO_OZ, new KgToOzConverter());
        converters.put(ConvertMethods.LB_TO_OZ, new LbToOzConverter());
        converters.put(ConvertMethods.LB_TO_KG, new LbToKgConverter());
        converters.put(ConvertMethods.OZ_TO_KG, new OzToKgConverter());
        converters.put(ConvertMethods.OZ_TO_LB, new OzToLbConverter());
    }


}
