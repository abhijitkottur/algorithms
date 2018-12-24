package com.abhijit;

public class Utils {

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
