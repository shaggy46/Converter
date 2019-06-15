package firstApp;


public enum ConvertMethods {
    KG_TO_LB("1"),
    KG_TO_OZ("2"),
    LB_TO_KG("3"),
    LB_TO_OZ("4"),
    OZ_TO_KG("5"),
    OZ_TO_LB("6");

    private String ConvertNumber;

    ConvertMethods(String ConvertNumber) {
        this.ConvertNumber = ConvertNumber;
    }

    public String getConvertNumber() {
        return this.ConvertNumber;
    }
    public static ConvertMethods chooseConvertMethods(String ConvertNumber){
        for(ConvertMethods i : ConvertMethods.values()){
            if(i.ConvertNumber.equalsIgnoreCase(ConvertNumber)){
                return i;
            }
        }
        return null;
    }
    public static ConvertMethods showNames(){
        for(ConvertMethods j : ConvertMethods.values()){
            System.out.println(j.name() +" " + j.ConvertNumber);

        }return null;
    }
}
