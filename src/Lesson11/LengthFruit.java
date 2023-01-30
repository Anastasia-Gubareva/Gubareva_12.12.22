package Lesson11;

import java.util.Arrays;
import java.util.List;

public class LengthFruit{
    public static void main(String[] args) {

    List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");
             fruits.stream()
                    .filter(e -> e.length() > 4)
                    .sorted()
                    .forEach(System.out::println);
        }
    }

