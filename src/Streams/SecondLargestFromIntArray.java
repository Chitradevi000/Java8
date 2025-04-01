package Streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestFromIntArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,5,6,7,8,9};
   Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }
}
