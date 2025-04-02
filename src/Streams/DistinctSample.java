package Streams;

import java.util.Arrays;
import java.util.List;

public class DistinctSample {
    public static void main(String[] args) {

        List<Character> listOfChar= Arrays.asList('a','a','a','b');

        listOfChar.stream().distinct().forEach(System.out::println);

        List<String> listOfString= Arrays.asList("a","chitra","chitra","d","e","f","g");
        listOfString.stream().distinct().forEach(System.out::println);

    }
}
