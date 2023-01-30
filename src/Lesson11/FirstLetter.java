package Lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FirstLetter {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");
        int summa = fruits.stream()
                .limit(3)
                .map(String :: length)
                .reduce(0, Integer :: sum);
        System.out.println(summa);
    }

}
