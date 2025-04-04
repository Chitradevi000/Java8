package CompletableFuture;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("start");
//        int result=checkProcess(5);
//        System.out.println("result="+result);

        CompletableFuture.supplyAsync(()->checkProcess(5));
        System.out.println("end");
    }

    public static int checkProcess(int value)
    {
        try{
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return value*10;
    }
}
