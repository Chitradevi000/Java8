package Streams;

import java.util.Arrays;
import java.util.List;

public class printNoLessThan10 {
    public static void main(String[] args) {

        List<Integer> listOfNumbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        listOfNumbers.stream().filter(a->a<3).reduce((a,b)->a+b).ifPresent(System.out::println);

    }
}
