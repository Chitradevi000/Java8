package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumWhichStarts3 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers= Arrays.asList(1,22,33,44,35,36,37,8,9);
        List<String> stringConverted=listOfNumbers.stream()
                .map(Object::toString)
                .toList();
        stringConverted.stream().filter(a->a.charAt(0)=='3').map(Integer::parseInt).reduce((a, b)->a+b).ifPresent(System.out::println);
    }
}
