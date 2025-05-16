package Streams;

import java.util.Arrays;
import java.util.List;

public class ConvertAllElementsToUpperCase {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("chit","mad","bal");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //reduce

        List<Integer> listOfnumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        listOfnumbers.stream().reduce((a,b)->a+b).ifPresent(System.out::println);

        //get the max element
        System.out.println("Below is the minimum element of the list");
        listOfnumbers.stream().min((a,b)->a-b).ifPresent(System.out::println);
    }
}
