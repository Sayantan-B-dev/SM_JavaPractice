class Human{
    private String name;
    private int age;

    public Human(String n,int a){
        this.name=n;
        this.age=a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        this.name = n;//this keyword refers to the current object/the instance variable 
    }
    public void setAge(int a){
        if (a>=0) {
            this.age = a;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human("Alice", 30);
        
        // Accessing private fields through public methods
        System.out.println("Name: " + human.getName());
        System.out.println("Age: " + human.getAge());
        
        // Modifying private fields through public methods
        human.setName("Bob");
        human.setAge(25);
        
        System.out.println("Updated Name: " + human.getName());
        System.out.println("Updated Age: " + human.getAge());
        
        // Attempting to set an invalid age
        human.setAge(-5); // This will print an error message
    }
}
