package MultithreadingConcepts;

public class MultiMain {
    public static void main(String[] args) {
        Test test = new Test();
        Thread t1 = new Thread(test);
        t1.start();
    }
}
