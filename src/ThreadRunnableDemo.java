// Method 2: Implementing the Runnable interface
// Program to create three threads: Good Morning (1s), Hello (2s), Welcome (3s)

class GoodMorningRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("GoodMorningRunnable interrupted");
            }
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("HelloRunnable interrupted");
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                System.out.println("WelcomeRunnable interrupted");
            }
        }
    }
}

public class ThreadRunnableDemo {
    public static void main(String[] args) {
        System.out.println("=== Method 2: Implementing Runnable Interface ===");
        System.out.println("Starting threads... (Press Ctrl+C to stop)\n");

        Thread t1 = new Thread(new GoodMorningRunnable());
        Thread t2 = new Thread(new HelloRunnable());
        Thread t3 = new Thread(new WelcomeRunnable());

        t1.start();
        t2.start();
        t3.start();
    }
}
