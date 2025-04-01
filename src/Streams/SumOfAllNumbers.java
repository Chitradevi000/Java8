package Streams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNumbers {

    public static void main(String[] args) {
        List<Integer> listOfNumbers= Arrays.asList(1,2,3,4);
       Optional<Integer> sumOfAllNumbers= listOfNumbers.stream().reduce((a, b)->a+b);
       System.out.println(sumOfAllNumbers);

    }

}
