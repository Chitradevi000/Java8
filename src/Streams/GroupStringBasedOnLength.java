package Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringBasedOnLength {
    public static void main(String[] args) {
        List<String> strList= List.of("Java","C","Streams","bala","chitra","b","madhu");


        //we have to return length and number of strings
        //Map<Integer,List<String>>

        Map<Integer,List<String>> result1= strList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result1);

        result1.entrySet().stream().forEach
                (
             e->
                     System.out.println("String size is " +
                             e.getKey() + "No of Strings in this length is " +
                             e.getValue().size() + e.getValue().toString())
                );
    }
}
