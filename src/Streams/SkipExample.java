package Streams;

import java.util.Arrays;
import java.util.List;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);
        listOfInteger.stream().skip(2).forEach(System.out::println);
    }
}
