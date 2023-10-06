package baiTap.bai3;

import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void pubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    private static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minValue]) > 0) {
                    minValue = j;
                }
            }
            if (minValue != i ){
                swap(arr, i, minValue);
            }
        }

    }
    private static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(arr[i]) > 0) {
                swap(arr, j + 1, j);
                j = j - 1;
            }
        }
    }
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
