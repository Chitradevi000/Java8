package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueElementFromStrArray {
    public static void main(String[] args) {
//        String str="Apple Banana Apple Orange Banana Mango";
        String str="Chitra devi";
        String[] strArray=str.split(" ");
        String result= Arrays.stream(strArray)
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

    }
}
