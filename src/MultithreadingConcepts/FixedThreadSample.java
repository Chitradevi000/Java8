package MultithreadingConcepts;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadSample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executor.execute(new ThreadBasic());
        }
        executor.shutdown();
    }

    public static class ThreadBasic implements Runnable {

        @Override
        public void run() {
            System.out.println("I am thread from Run -" + Thread.currentThread().getName());
        }
    }
}
