package marketproject;

public enum StandsName {

    bananas("BANANA'S"),apples("APPLE'S"),oranges("ORANGES");

    private final String standName;


    StandsName(String standName){
        this.standName = standName;
    }


    public String getStandName(){
        return standName;
    }
}
