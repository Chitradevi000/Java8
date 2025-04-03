package Streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<Character> listOfChar= Arrays.asList('c','C','v','b');
        boolean result=   listOfChar.stream().anyMatch(c->c=='t');
        System.out.println(result);
    }
}
