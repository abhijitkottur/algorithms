package com.abhijit;

import java.util.stream.IntStream;

public class ShellSort {

    public static void main (String[] args) {
        int[] arr = Utils.buildNewIntArray();
        int length = arr.length;

        Utils.println("Before sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

        int[] sortedArr = shellSort(arr);
        Utils.println("After sort");
        IntStream.range(0, length).forEach(i -> Utils.println(sortedArr[i]));
    }

    private static int[] shellSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }

        int gap = length / 2;
        while (gap > 0) {
            int firstUnsortedIndex = gap;
            while (firstUnsortedIndex < length) {
                int newUnsortedElement = arr[firstUnsortedIndex];
                int i;
                for (i = firstUnsortedIndex; i > 0 && newUnsortedElement < arr[i-gap]; i -= gap) {
                    arr[i] = arr[i-gap];
                }
                arr[i] = newUnsortedElement;
                firstUnsortedIndex++;
            }
            gap /= 2;
        }

        return arr;
    }
}
