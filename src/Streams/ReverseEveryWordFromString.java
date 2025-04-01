package Streams;

import java.util.Arrays;

public class ReverseEveryWordFromString {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        Arrays.stream(words).map(i-> new StringBuilder(i).reverse().toString()).forEach(System.out::println);
    }
}
