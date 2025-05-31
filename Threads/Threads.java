class A extends Thread {
    //run method is compulsory for thread
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("A: " + i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted");
            }
        }
    }
}
class B extends Thread {
    //run method is compulsory for thread
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("B: " + i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted");
            }
        }
    }
}

public class Threads{
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        threadA.start();
        threadB.start();
    }
}