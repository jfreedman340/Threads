package src;

import java.util.Random;

/**
 * @Author Trevor Hartman
 *
 * Copied by Joseph Freedman
 *
 * Notes:
 * I do not take credit for this, I copied it from Mr. Hartman's video lesson.
 */

public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    private Random random;


    RunnableDemo(String name) {
        threadName = name;
        random = new Random();
        System.out.println("Creating " + threadName );
    }

    public void run() {
        System.out.println("Running " + threadName );
        try {
            for(int i = 20; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.

                Thread.sleep(random.nextInt(100) + 20);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread (this, threadName);
            t.start();
        }
    }
}
