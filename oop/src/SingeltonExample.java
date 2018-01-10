public class SingeltonExample {


    private String name;
    private String name2;
    private static SingeltonExample instance = null;

    private SingeltonExample(){
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public static SingeltonExample getInstance(){
        if (instance == null){
            instance = new SingeltonExample();
        }
        return instance;

    }


    public static void main (String [] arg){

        SingeltonExample singelton1 = SingeltonExample.getInstance();
        singelton1.setName("fwf");
        System.out.println( singelton1.getName());
        SingeltonExample singelton2 = SingeltonExample.getInstance();

        System.out.println(singelton1 == singelton2);
    }


}


