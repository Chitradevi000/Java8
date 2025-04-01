package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetUniqueElementFromStrArray {
    public static void main(String[] args) {
        String str="I love Java and I love SQL too";
        String[] strs=str.split(" ");
        List<String> list= Arrays.asList(strs);
        list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                )).entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
