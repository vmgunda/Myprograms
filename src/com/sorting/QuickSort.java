package com.sorting;

public class QuickSort {


    public  void quickSort(int[] a, int low, int high) {
        int pivot = partition(a, low, high);
        quickSort(a, low, pivot);
        quickSort(a, pivot, high);

    }

    // pivot returns the index of the array
    int partition(int[] a, int low, int high) {
        // make pivot as high;
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j <= high-1; j++) {

            // if current element is less than pivot then swap
            if (a[j] < pivot)  {
                i++;
                swap(a, i, j);
            }
        }

        // swap the first and last element
        swap(a, (i+1), high);
        return i+1;
    }

    void swap(int[] a, int i, int j ) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
