// Method 1: Extending the Thread class
// Program to create three threads: Good Morning (1s), Hello (2s), Welcome (3s)

class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("GoodMorningThread interrupted");
            }
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("HelloThread interrupted");
            }
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                System.out.println("WelcomeThread interrupted");
            }
        }
    }
}

public class ThreadExtendingDemo {
    public static void main(String[] args) {
        System.out.println("=== Method 1: Extending Thread Class ===");
        System.out.println("Starting threads... (Press Ctrl+C to stop)\n");

        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
