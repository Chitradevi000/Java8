package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheLetters {
    public static void main(String[] args) {
        String str="I love Java";
        String[] strArray=str.split(" ");
        List<Character> charList = str.chars().mapToObj(i -> (char) i).collect(Collectors.toList());

       Map<Character,Long> result= charList.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
       System.out.println(result);
    }
}
