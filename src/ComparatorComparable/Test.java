package ComparatorComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("keyboard","mouse","mouse","mouse","monitor","speaker");

        //eliminates the duplicates

        list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                )).//
                entrySet().stream()
                .filter(e -> e.getValue() >1)// mouse 1
                .map(e -> e.getKey())
                .forEach(System.out::println);


        ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.asList(3,4,5,7,6,1);
//        list2.sort();









    }
}
