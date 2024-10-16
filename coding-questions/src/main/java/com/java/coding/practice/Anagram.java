package com.java.coding.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "Mother In Law";
        String str2 = "Hitler Woman";

        str1 =  str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();


        if(str1.length() != str2.length()) {
            System.out.println("Length not equal.");
            return;
        }

        System.out.println(str1 + " " + str2);

        //method1(str1, str2);

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }

    }

    private static void method1(String str1, String str2) {
        Map<Character, Long> map1 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> map2 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map1.entrySet().stream().forEach(entry -> {
            Character key = entry.getKey();
            Long value = entry.getValue();

            if (!(map2.containsKey(key) && value == map2.get(key))) {
                System.out.println("Not Anagram");
            }
        });

        System.out.println("Anagram");
    }
}
