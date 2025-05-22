package Streams;

import java.util.Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Chitra";
        String[] strArr = str.split(" ");
        Arrays.stream(strArr).map(a -> new StringBuilder(a).reverse()).filter(a -> !a.equals(str)).forEach(i -> System.out.print("String is not palin-" + i));
    }
}
