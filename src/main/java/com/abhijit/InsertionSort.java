package com.abhijit;

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
            int insertionIndex = firstUnsortedIndex;
            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
                if (newUnsortedElement < arr[i]) {
                    arr[i+1] = arr[i];
                    insertionIndex = i;
                } else {
                    break;
                }
            }
            arr[insertionIndex] = newUnsortedElement;
            firstUnsortedIndex++;
        }
        return arr;
    }
}
