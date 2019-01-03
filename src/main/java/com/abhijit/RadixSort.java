package com.abhijit;

import java.util.stream.IntStream;

public class RadixSort {

    public static void main (String[] args) {
        int min = 1001, max = 9999;
        int[] arr = Utils.buildNewIntArrayByRange(6, min, max);
        int length = arr.length;

        Utils.println("Before sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));

        radixSort(arr, 10, 4);
        Utils.println("After sort");
        IntStream.range(0, length).forEach(i -> Utils.println(arr[i]));
    }

    private static void radixSort(int[] arr, int radix, int width) {
        if (arr.length <= 1) {
            return;
        }

        for (int i = 0; i < width; i++) {
            radixSingleSort(arr, i, radix);
        }
    }

    private static void radixSingleSort(int[] arr, int positionFromRight, int radix) {
        int length = arr.length;

        // Conventional count array. This can lead to unstable sorting
        int[] countArr = new int[radix];
        for (int value : arr) {
            countArr[getDigit(positionFromRight, value, radix)]++;
        }

        // Cumulative count array
        for (int j = 1; j < radix; j++) {
            countArr[j] += countArr[j-1];
        }

        // Stable sort
        int[] temp = new int[length];
        for (int tempIndex = length - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArr[getDigit(positionFromRight, arr[tempIndex], radix)]] = arr[tempIndex];
        }

        // Copy the temp array to the input array
        System.arraycopy(temp, 0, arr, 0, length);
    }

    private static int getDigit(int positionFromRight, int value, int radix) {
        return value / (int) Math.pow(radix, positionFromRight) % radix;
    }
}
