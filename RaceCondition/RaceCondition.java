class Counter{
    int count;// by default it is 0 

    public synchronized void increment() {
        count++;
    }

}
public class RaceCondition {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable threadA = () -> { // new Runnable is functional interface so we can use lambda expression
            for (int i = 0; i < 10000000; i++) {
                c.increment();
            }
        };
        Runnable threadB = () -> { // new Runnable is functional interface so we can use lambda expression
            for (int i = 0; i < 10000000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + c.count);
    }
}
