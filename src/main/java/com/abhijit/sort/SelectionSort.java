package com.abhijit.sort;

import java.util.stream.IntStream;

public class SelectionSort {

    public static void main (String[] args) {
        int[] arr = Utils.buildNewIntArray();
        int length = arr.length;

        Utils.println("Before sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

        int[] sortedArr = selectionSort(arr);
        Utils.println("After sort");
        IntStream.range(0, length).forEach(i -> Utils.println(sortedArr[i]));
    }

    private static int[] selectionSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }

        int lastUnsortedIndex = length - 1;
        while(lastUnsortedIndex != 0) {
            int largestElementIndex = 0;
            for (int i = 1; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[largestElementIndex]) {
                    largestElementIndex = i;
                }
            }
            Utils.swap(arr, largestElementIndex, lastUnsortedIndex);
            lastUnsortedIndex--;
        }
        return arr;
    }
}
