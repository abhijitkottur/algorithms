package com.abhijit;

import java.util.Random;

public class Utils {

    public static int[] buildNewIntArray() {
        int[] arr = new int[7];
        arr[0] = 20;
        arr[1] = 35;
        arr[2] = -15;
        arr[3] = 7;
        arr[4] = 55;
        arr[5] = 1;
        arr[6] = -22;
        return arr;
    }

    public static int[] buildNewIntArrayByRange(int size, int min, int max) {
        return new Random().ints(size, min, max + 1).toArray();
    }

    public static void println(Object o) {
        System.out.println(o);
    }

    public static void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
