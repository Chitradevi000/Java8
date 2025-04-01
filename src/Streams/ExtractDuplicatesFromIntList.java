package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExtractDuplicatesFromIntList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(112, 112, 34, 34, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        listOfIntegers.stream().collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()
        )).entrySet().stream().filter(e -> e.getValue() > 1)
                .map(e -> e.getKey()).collect(Collectors.toList()).forEach(i->System.out.println("The Duplicate elemets are   "+i));
    }
}
