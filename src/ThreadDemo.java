package src;

import java.util.Random;

/**
 * @Author Trevor Hartman
 *
 * Copied by Joseph Freedman
 *
 * Notes:
 * I do not take credit for this, I copied and modified it from Mr. Hartman's video lesson.
 */

public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    private Random random;


    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName );
    }

    public void run() {
        System.out.println("Running " + threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Hello from " + threadName + " of processor " + i);
                // Let the thread sleep for a while.

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Hello from " + threadName + " interrupted.");
        }
        System.out.println(threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread (this, threadName);
            t.start();
        }
    }
}
