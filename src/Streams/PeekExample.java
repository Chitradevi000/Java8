package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<String> listOfString= Arrays.asList("a","b","c","d","e","f","g","h","i");
        listOfString.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .toList();

        listOfString.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
