package Streams;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseAnArrayOfIntegers {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1,2,3,4,5,6,7,8,9};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        Arrays.stream(intArr).sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
