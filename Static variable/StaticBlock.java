class mobile {
    int price;
    String brand;
    static int ram;

    static {
        ram = 4; // Default RAM value
        System.out.println("Static block executed. Default RAM set to " + ram + " GB.");
    }//will be executed only once no matter how many time we create an object of this class
    public mobile() {
        // Constructor can be used to initialize instance variables if needed
        price   = 0;
        brand   = "Unknown";
        System.out.println("Constructor executed for " + brand + " mobile.");
    }
    static void show(mobile m) {
        System.out.println(m.brand+ " mobile is available at a price of " + m.price + " with RAM: " + ram);
    }
}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("mobile");//Static block executed. Default RAM set to 4 GB.
        // mobile m1 = new mobile();
        // m1.brand = "Samsung";
        // m1.price = 30000;
        // mobile m2 = new mobile();
        // m2.brand = "Apple";
        // m2.price = 100000;

        // mobile.ram = 8; 

        // mobile.show(m1);
        // mobile.show(m2);
    }
}
