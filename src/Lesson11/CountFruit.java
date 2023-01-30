package Lesson11;

import java.util.Arrays;
import java.util.List;

public class CountFruit {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");

        System.out.println(fruits.stream()
                .filter(str -> str.toLowerCase().charAt(0) == 'a')
                .count());

    }
}
