package Streams;

import java.util.Arrays;
import java.util.List;

public class CommonEleBtwTwoList {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(11,21,3,4,5);

        list1.stream().filter(list2::contains).forEach(System.out::println);
    }
}
