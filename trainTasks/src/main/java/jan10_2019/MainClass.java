package jan10_2019;

public class MainClass {
    static int number = 1;
    private String name;
    private int quantity;
    private Float f;

//    static {
//        System.out.println("Static main");
//    }
//
//    {
//        System.out.println("Main");
//    }


    public MainClass() {

        System.out.println("MainClass constructor");
    }

    public MainClass(int q, String s) {
        quantity = q;
        name  = s;
    }

    public int calc() {
        return number * 2;
    }

    static int getAny(){
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}