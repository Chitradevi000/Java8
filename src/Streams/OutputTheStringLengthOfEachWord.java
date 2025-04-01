package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OutputTheStringLengthOfEachWord {
    public static void main(String[] args) {
        List<String> listOfWords= Arrays.asList("Chitra","madhu","bala","aadhi");
       Map<Integer,List<String>> result= listOfWords.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
