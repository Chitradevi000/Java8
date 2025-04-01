package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInIntList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(112,112,33,4,5,33,7,8,9,10);
        HashSet<Integer> hashSet = new HashSet<>(listOfIntegers);
        System.out.println("Plain use " +hashSet);

        //using stream

        listOfIntegers.stream().distinct().collect(Collectors.toList()).forEach(i->System.out.println("The unique elemets are   "+i));



    }
}
