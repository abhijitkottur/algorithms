package com.abhijit.sort;

import com.abhijit.Utils;

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
            for (int i = gap; i < length; i++) {
                int newUnsortedElement = arr[i];
                int j;
                for (j = i; j >= gap && newUnsortedElement < arr[j-gap]; j -= gap) {
                    arr[j] = arr[j-gap];
                }
                arr[j] = newUnsortedElement;
            }
            gap /= 2;
        }

        return arr;
    }
}
