interface Computer {
    void display();
}
class Laptop implements Computer {
    @Override
    public void display() {
        System.out.println("Display from Laptop class");
    }
}
class Desktop implements Computer {
    @Override
    public void display() {
        System.out.println("Display from Desktop class");
    }
}
class Devloper {
    public void show(Computer computer) {
        computer.display();
    }
}

public class ExampleOfInterface {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Devloper devloper = new Devloper();
        devloper.show(laptop); // Output: Display from Laptop class
        devloper.show(desktop); // Output: Display from Desktop class
    }
}
