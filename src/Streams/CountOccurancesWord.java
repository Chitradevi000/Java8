package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurancesWord {
    public static void main(String[] args) {
        String str = "I love Java";
        String[] strArray = str.split(" ");
        Map<String, Long> result = Arrays.stream(strArray).collect(
                Collectors.groupingBy(a->a,Collectors.counting()));
       System.out.println(result);
    }
}
