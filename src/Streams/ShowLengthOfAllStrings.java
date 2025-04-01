package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShowLengthOfAllStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("Chitra","bala","madhu");
       Map<Integer,List<String>> result= listOfStrings.stream().collect(Collectors.groupingBy(String::length));
       System.out.println(result);
    }
}
