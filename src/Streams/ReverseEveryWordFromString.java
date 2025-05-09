package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseEveryWordFromString {
    public static void main(String[] args) {
        String str = "Hello World chitra mathan bala shanmugam";
        String[] words = str.split(" ");
        Arrays.stream(words).map(i-> new StringBuilder(i).reverse().toString()).forEach(System.out::println);

        //using comparator sort the words in asc

        List<String> listOfString =Arrays.asList("hello","world","bala","shan","mathan","chitra");
        listOfString.sort(String::compareTo);//asc
        System.out.println("asc order: " +listOfString);
        System.out.println("Asc order using stream: ");
        listOfString.stream().sorted().forEach(System.out::println);
        System.out.println("desc order using stream: " );
        listOfString.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
