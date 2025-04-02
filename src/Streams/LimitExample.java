package Streams;

import java.util.Arrays;
import java.util.List;

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);
        listOfInteger.stream().limit(2).forEach(System.out::println);
    }
}
