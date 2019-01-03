package com.abhijit.sort;

import com.abhijit.Utils;

import java.util.stream.IntStream;

public class QuickSort {

    public static void main (String[] args) {
        int[] arr = Utils.buildNewIntArray();
        int length = arr.length;

        Utils.println("Before sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

        quickSort(arr);
        Utils.println("After sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));
    }

    private static void quickSort(int[] arr) {
        recursiveQuickSort(arr, 0, arr.length);
    }

    private static void recursiveQuickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(arr, start, end);
        recursiveQuickSort(arr, start, pivotIndex);
        recursiveQuickSort(arr, pivotIndex + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        // Use the first element of the array as the pivot
        int pivot = arr[start];

        int i = start, j = end;
        while (i < j) {
            // Empty loop body to find a value lesser that the pivot
            while (i < j && arr[--j] >= pivot);
            if (i < j) {
                arr[i] = arr[j];
            }

            // Empty loop body to find a value greater that the pivot
            while (i < j && arr[++i] <= pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }
}
