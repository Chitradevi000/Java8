package MultithreadingConcepts;

public class Test implements Runnable {
    @Override
    public void run() {
        //i ll be having my code here
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
