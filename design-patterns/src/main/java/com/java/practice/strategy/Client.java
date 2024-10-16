package com.java.practice.strategy;

public class Client {


    public static void main(String[] args) {

        int[] arr = {};
        SortingContext context = new SortingContext(new BubbleSortStrategy());
        SortingContext context1 = new SortingContext(new MergeSortStrategy());
        context.performSort(arr);
        context1.performSort(arr);

    }

}
