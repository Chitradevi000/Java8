package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueElementFromStrArray {
    public static void main(String[] args) {
        String str="Apple Banana apple Orange Banana Mango";
//        String str="Chitra devi";
        String[] strArray=str.split(" ");
        List<String> listOfWords=Arrays.asList(strArray);
        String result= Arrays.stream(strArray)
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        a->a, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .limit(1)
                .findFirst()
                .get();
        System.out.println(result);

//        String str="Apple Banana Apple Orange Banana Mango";


    }
}
