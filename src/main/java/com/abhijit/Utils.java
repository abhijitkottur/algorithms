package com.abhijit;

class Utils {

    static void println(Object o) {
        System.out.println(o);
    }

    static void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
