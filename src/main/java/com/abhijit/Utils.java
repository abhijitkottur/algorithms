package com.abhijit;

class Utils {

    static int[] buildNewIntArray() {
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
