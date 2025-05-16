package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Return4thCharNonRepeative {
    public static void main(String[] args) {
        String str = "I am a Java Developer";
        List<Character> charList = str.chars().mapToObj(i -> (char) i).toList();

        char fourthChar = charList.stream()
                .filter(i -> Collections.frequency(charList, i) == 1)
                .limit(4).skip(3).findFirst().get();
        System.out.println(fourthChar);

        //another method
       Character charResult= charList.stream().
                collect(Collectors.groupingBy(
                        a->a, LinkedHashMap::new,Collectors.counting()

                )).entrySet()
                .stream().filter(e->e.getValue()==1).map(e->e.getKey())
                .limit(4).skip(3).findFirst().get();
       System.out.println(charResult);
    }}
