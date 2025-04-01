package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CombineTwoList {
    public static void main(String[] args) {
        List<String> list1 = List.of("Chitra","bala","madhu");
        List<String> list2 = List.of("Jaya","Jani","Mathan");
        Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);
    }
}
