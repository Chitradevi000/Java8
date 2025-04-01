package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FirstRepeatCharInString {
    public static void main(String[] args) {
        String str="Indian";
        String[] strArray=str.split(" ");
        List<Character> charArray= Arrays.stream(strArray).
                flatMap(word->word.chars().mapToObj(a->(char)a))
                .toList().stream().map(e->Character.toLowerCase(e))
                .collect(Collectors.toList());
        charArray.stream().
                collect(Collectors.groupingBy(
                        a->a, LinkedHashMap::new,Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .limit(1)
                .findFirst().ifPresent(System.out::println);
    }
}
