
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        a.sound(); // Animal makes a sound
        d.sound(); // Dog barks
    }
}
