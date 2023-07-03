package nauka;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = () ->{
                String threadName = Thread.currentThread().getName();
            System.out.println("Hello" + threadName );
        };
        runnable.run();

    Thread thread = new Thread(runnable);
    thread.start();
    }
}
