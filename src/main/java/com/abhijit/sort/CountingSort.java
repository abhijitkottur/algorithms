package com.abhijit.sort;

import com.abhijit.Utils;

import java.util.stream.IntStream;

public class CountingSort {

    public static void main (String[] args) {
        int min = 1, max = 10;
        int[] arr = Utils.buildNewIntArrayByRange(10, min, max);
        int length = arr.length;

        Utils.println("Before sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

        countingSort(arr, min, max);
        Utils.println("After sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));
    }

    private static void countingSort(int[] arr, int min, int max) {
        int length = arr.length;
        if (length <= 1) {
            return;
        }

        // Both min and max inclusive
        int[] countingArr = new int[(max - min) + 1];
        for (int i = 0; i < length; i++) {
            countingArr[arr[i] - min]++;
        }

        int sortedIndex = 0;
        for (int i = 0; i < countingArr.length; i++) {
            int count = countingArr[i];
            if (count > 0) {
                int j = 0;
                while (j < count) {
                    arr[sortedIndex + j] = min + i;
                    j++;
                }
                sortedIndex += j;
            }
        }

        // Other way of doing it
//        int j = 0;
//        for (int i = min; i <= max; i++) {
//            while (countingArr[i - min] > 0) {
//                arr[j++] = i;
//                countingArr[i - min]--;
//            }
//        }
    }
}
