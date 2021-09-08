package com;

public class Demo {

    public static void main(String[] args) {

        int arr[] = {-2, 3, 22, 56, 6, 0, 22, 101};
/*        System.out.println("Array before sorting");
        printArray(arr);
        Demo.sort(arr);
        System.out.println("Array after sorting");
        printArray(arr);*/
        System.out.println("Array before sorting");
        printArray(arr);
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting");
        printArray(arr);


    }

    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
