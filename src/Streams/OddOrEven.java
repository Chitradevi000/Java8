package Streams;

import java.util.Arrays;
import java.util.List;

public class OddOrEven {
    public static void main(String[] args) {
        List<Integer> listOfNumbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        listOfNumbers.stream().filter(a->a%2==0).forEach(System.out::println);
        listOfNumbers.stream().filter(a->a%2!=0).forEach(System.out::println);

    }
}
