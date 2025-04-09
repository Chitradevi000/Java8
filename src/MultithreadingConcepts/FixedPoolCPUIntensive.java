package MultithreadingConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolCPUIntensive {
    public static void main(String[] args) {
        int corecount=Runtime.getRuntime().availableProcessors();//this will give you core count of your CPU
       System.out.println("Corecount of my CPU is -"+corecount);

        ExecutorService executor = Executors.newFixedThreadPool(corecount);

        for (int i = 0; i < 100; i++) {
            executor.execute(new ThreadBasic());
        }
        executor.shutdown();
    }
    public static class ThreadBasic implements Runnable {
        public void run() {
            System.out.println("I am in Main class- " + Thread.currentThread().getName());
        }
    }
}
