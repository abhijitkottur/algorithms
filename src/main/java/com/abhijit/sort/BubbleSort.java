package com.abhijit.sort;

import com.abhijit.Utils;

import java.util.stream.IntStream;

public class BubbleSort {

    public static void main (String[] args) {
        int[] arr = Utils.buildNewIntArray();
        int length = arr.length;

        Utils.println("Before sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

        int[] sortedArr = bubbleSort(arr);
        Utils.println("After sort");
        IntStream.range(0, length).forEach(i -> Utils.println(sortedArr[i]));
    }

    private static int[] bubbleSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }

        int lastUnsortedIndex = length - 1;
        while(lastUnsortedIndex != 0) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    Utils.swap(arr, i, i + 1);
                }
            }
            lastUnsortedIndex--;
        }
        return arr;
    }
}
