package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstUniqueCharFromStr {
    public static void main(String[] args) {
        String str="Chitra devi";
        String[] strArray =str.split(" ");
        List<Character> charList1= str.chars().mapToObj(c->(char)c).collect(Collectors.toList()).stream().map(Character::toLowerCase).toList();
    /*    List<Character> charList = Arrays.stream(strArray)
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());*/

        char result= charList1.stream()
                .collect(Collectors.groupingBy(a->a, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList()
                .stream()
                .limit(1)
                .findFirst()
                .get();
        System.out.println("This result will excludes the space "+result);


        //another method which excludes the space
//        String[] strArray =str.split(" ");
//       String anotherresult= Arrays.stream(strArray).collect(Collectors.groupingBy(
//                a->a, LinkedHashMap::new,Collectors.counting()
//        )).entrySet().stream().filter(e -> e.getValue() == 1).map(e->e.getKey())
//                .limit(6).skip(5).findFirst().orElse(null);
//        System.out.println("The right result which excludes the space--"+ anotherresult);
    }
}
