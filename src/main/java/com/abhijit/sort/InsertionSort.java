package com.abhijit.sort;

import com.abhijit.Utils;

import java.util.stream.IntStream;

public class InsertionSort {

    public static void main (String[] args) {
        int[] arr = Utils.buildNewIntArray();
        int length = arr.length;

        Utils.println("Before sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

        int[] sortedArr = insertionSort(arr);
        Utils.println("After sort");
        IntStream.range(0, length).forEach(i -> Utils.println(sortedArr[i]));
    }

    private static int[] insertionSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }

        int firstUnsortedIndex = 1;
        while (firstUnsortedIndex < length) {
            int newUnsortedElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && newUnsortedElement < arr[i-1]; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = newUnsortedElement;
            firstUnsortedIndex++;
        }
        return arr;
    }
}
