package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FirstRepeatCharInString {
    public static void main(String[] args) {
        String str="Indian";
        List<Character> charList=str.chars().mapToObj(i->(char)i).toList().stream().map(Character::toLowerCase).toList();
        String[] strArray=str.split(" ");
        /*List<Character> charArray= Arrays.stream(strArray) //stream of streams - hence we have to use flatmap
                .flatMap(word->word.chars()
                .mapToObj(a->(char)a))
                .toList()
                .stream()
                .map(Character::toLowerCase)
                .toList();*/
        charList.stream(). // instead of chararray, we are using charList
                collect(Collectors.groupingBy(a->a, LinkedHashMap::new,Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .limit(1)
                .findFirst().ifPresent(System.out::println);
    }
}
