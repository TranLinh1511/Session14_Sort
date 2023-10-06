package baiTap.bai1;

import java.util.Arrays;


public class Bai1 {
    public static void main(String[] args) {
        int[]  arr= getArr();
        pubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void pubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[minValue]) {
                    minValue = j;
                }
            }
            if (minValue != i ){
                swap(arr, i, minValue);
            }
        }

    }
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int[] getArr() {
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
