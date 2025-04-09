package CompletableFutureSample;

import java.util.concurrent.CompletableFuture;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("start");
//        int result=checkProcess(5);
//        System.out.println("result="+result);

        CompletableFuture.supplyAsync(()->checkProcess(5)).thenAccept(System.out::println);
        sleepForSomeTime();
        //runAsync is used when you dont want to return any value from child process
        System.out.println("end");
    }

    public static int checkProcess(int value)
    {
        sleepForSomeTime();
        return value*10;
    }

    public static void sleepForSomeTime()
    {
        try{
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
