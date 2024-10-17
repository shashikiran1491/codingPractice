package com.java.practice.generic;

public class StringContainsOnlyAlphabets {

    public static void main(String[] args) {

        String str = "GeeksforGeeks";
        String str1 = "Geeks$forGeeks";
        System.out.println(str1.chars().allMatch( x -> Character.isLetter(x)));

    }

}
