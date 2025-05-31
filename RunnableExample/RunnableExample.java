// class A implements Runnable {
//     //run method is compulsory for thread
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("AAAAAAAAAA: " + i);
//             try{
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 System.out.println("Thread A interrupted");
//             }
//         }
//     }
// }
class B implements Runnable {
    // run method is compulsory for thread
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("BBBBBBBBBB: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted");
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Runnable threadA = ()->{ //new Runnable is functional interface so we can use lambda expression
            for (int i = 0; i < 10; i++) {
                System.out.println("AAAAAAAAAA: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread A interrupted");
                }
            }
        };

        B threadB = new B();

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);t1.start();t2.start();
    }
}