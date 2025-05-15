package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapTwoList {
    public static void main(String[] args) {
        List<Integer> listA= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> listB= new ArrayList<>(Arrays.asList(11,22,33,44));

        List<Integer> tempA = new ArrayList<>(listA);
        List<Integer> tempB = new ArrayList<>(listB);

        listA.clear();
        listA.addAll(tempB);
        listB.clear();
        listB.addAll(tempA);

        System.out.println(listA);
        System.out.println(listB);
    }
}
