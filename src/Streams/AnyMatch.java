package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnyMatch {
    public static void main(String[] args) {
        List<Character> listOfChar= Arrays.asList('c','C','v','b');
        boolean result=   listOfChar.stream().anyMatch(c->c=='t');
        Long countresult = listOfChar.stream().filter(c -> c == 'c').count();
        System.out.println(result);
        System.out.println(countresult);
    }
}
