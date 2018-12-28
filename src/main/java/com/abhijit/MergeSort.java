package com.abhijit;

import java.util.stream.IntStream;

public class MergeSort {

    public static void main (String[] args) {
        int[] arr = Utils.buildNewIntArray();
        int length = arr.length;

        Utils.println("Before splitAndSort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

        mergeSort(arr);
        Utils.println("After splitAndSort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));
    }

    private static void mergeSort(int[] arr) {
        recursiveMergeSort(arr, 0, arr.length);
    }

    private static void recursiveMergeSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        recursiveMergeSort(arr, start, mid);
        recursiveMergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid-1] <= arr[mid]) {
            return;
        }

        int[] tempArr = new int[end - start];

        int i = start, j = mid, tempIndex = 0;
        while (i < mid && j < end) {
            tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++]; // The '=' implies stable sorting
        }

        // Copy left over elements from left array, if any, to the end of the input array.
        // We don't care about the left over elements from the right array, if any, as the
        // elements are already in correct position
        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);

        // Copy the sorted elements for the tempArr to the input array
        System.arraycopy(tempArr, 0, arr, start, tempIndex);
    }

}
