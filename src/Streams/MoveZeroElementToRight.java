package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroElementToRight {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(0,2,3,0,5,6,0,8,9);

        Stream.concat(
                numbers.stream().filter(n->n!=0),
                numbers.stream().filter(n->n==0)
        ).collect(Collectors.toList()).forEach(System.out::print);
    }
}
