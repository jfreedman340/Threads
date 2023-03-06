package src;

public class Main {
    public static void main(String[] args) {
        /*
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        RunnableDemo R2 = new RunnableDemo("Thread-2");
        RunnableDemo R3 = new RunnableDemo("Thread-3");
        RunnableDemo R4 = new RunnableDemo("Thread-4");

        R1.start();
        R2.start();
        R3.start();
        R4.start();
        */
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        ThreadDemo T2 = new ThreadDemo("Thread-2");

        T1.start();
        T2.start();
    }
}
