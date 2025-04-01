package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="I love Java Java";
        String[] strArray=str.split(" ");
        Arrays.stream(strArray).
                collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet() //entryset is nothing but a map
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(i->System.out.println("here are the values which are removed duplicates "+i));
    }
}
