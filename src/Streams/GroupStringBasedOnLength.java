package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringBasedOnLength {
    public static void main(String[] args) {
        String str="Java c streams bala chitra b madhu";
        String[] strarr=str.split(" ");
        List<String> listOfStrings= Arrays.asList(strarr);

        List<String> strList= List.of("Java","C","Streams","bala","chitra","b","madhu");


        //we have to return length and number of strings
        //Map<Integer,List<String>>

        Map<Integer,List<String>> result1= listOfStrings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result1);

        result1.entrySet().stream().forEach
                (
             e->
                     System.out.println("String size is -" +
                             e.getKey() + ", No of Strings in this length is -" +
                             e.getValue().size() + ",  "+ e.getValue().toString())
                );
    }
}
