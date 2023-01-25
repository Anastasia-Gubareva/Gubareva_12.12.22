package Lesson10;


import java.util.*;

public class SottedHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1003, "Alla");
        map.put(1005,"Zina");
        map.put(1001,"Sasha");
        map.put(1002, "Borya");
        map.put(1004, "Toma");

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }



  }

