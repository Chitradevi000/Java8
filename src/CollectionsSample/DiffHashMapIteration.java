package CollectionsSample;

import java.util.HashMap;

public class DiffHashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        //Iteration 1 - using lambda
        System.out.println("Using Lambda");
        map.forEach((k,v)->System.out.println(k+" "+v));

        //2 - using entryset
        System.out.println("Using EntrySet");
        map.entrySet().forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));

        //3.Using Keyset
        System.out.println("Using Keyset");
        map.keySet().forEach(k->System.out.println(k+" "+map.get(k)));
    }
}
