package com.java.practice.strategy;

public class SortingContext {

    SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] arr) {
        sortingStrategy.sort(arr);
    }
}
