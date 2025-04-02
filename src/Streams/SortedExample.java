package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> listOfInteger= Arrays.asList(1,2,33,4,5,6,7,8,9);

        //asc order
        listOfInteger.stream().sorted().forEach(System.out::println);
        //desc order
        listOfInteger.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> listOfString =Arrays.asList("a","chitra","chitradevi","d","e","f","g");
        //sort based on length

        listOfString.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

    }
}
