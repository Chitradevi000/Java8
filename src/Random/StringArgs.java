package Random;

public class StringArgs {
    public static void main(String[] args) {
        String names[]=new String[5];
        for(int i=0;i<args.length;i++) // this loop will not be run
        {
            names[i]=args[i];
        }
        System.out.println(names[2]);

    }
}
