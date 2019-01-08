package com.abhijit.sort;

import com.abhijit.Utils;

import java.util.stream.IntStream;

public class InsertionSort {

    public static void main (String[] args) {
        int[] arr = Utils.buildNewIntArray();
        int length = arr.length;

        Utils.println("Before sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

//        insertionSort(arr);
        insertionSortWithRecursion(arr);
        Utils.println("After sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));
    }

    private static void insertionSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return;
        }

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < length; firstUnsortedIndex++) {
            int newUnsortedElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i-1] > newUnsortedElement; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = newUnsortedElement;
        }
    }

    private static void insertionSortWithRecursion(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return;
        }

        insertionSortRecursive(arr, arr.length - 1);
    }

    private static void insertionSortRecursive(int[] arr, int firstUnsortedIndex) {
        if (firstUnsortedIndex == 0) {
            return;
        }

        insertionSortRecursive(arr, firstUnsortedIndex - 1);

        int newUnsortedElement = arr[firstUnsortedIndex];
        int insertionPosition = shift(arr, firstUnsortedIndex, newUnsortedElement);
        arr[insertionPosition] = newUnsortedElement;
    }

    private static int shift(int[] arr, int i, int newUnsortedElement) {
        if (i > 0 && arr[i-1] > newUnsortedElement) {
            arr[i] = arr[i-1];
            return shift(arr, --i, newUnsortedElement);
        }
        return i;
    }
}
