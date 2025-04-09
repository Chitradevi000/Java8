package MultithreadingConcepts;

public class BasicThread {
    public static void main(String[] args) {
            Thread thread = new Thread(new ThreadBasic());
            thread.start();
            System.out.println("I am in Main class- " + Thread.currentThread().getName());
    }
    public static class ThreadBasic implements Runnable {
        public void run() {
            System.out.println("I am inside ThreadClass- " + Thread.currentThread().getName());
        }
    }
}
