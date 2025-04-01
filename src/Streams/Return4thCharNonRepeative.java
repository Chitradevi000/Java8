package Streams;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Return4thCharNonRepeative {
    public static void main(String[] args) {
        String str = "I am a Java Developer";
        List<Character> charList = str.chars().mapToObj(i -> (char) i).collect(Collectors.toList());

        char fourthChar = charList.stream()
                .filter(i -> Collections.frequency(charList, i) == 1)
                .limit(4).skip(3).findFirst().get();
        System.out.println(fourthChar);
    }}
