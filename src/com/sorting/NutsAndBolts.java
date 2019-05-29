package com.sorting;

public class NutsAndBolts {

    void nutsAndBolts(char[] nuts, char[] bolts, int low, int high) {
        int pivotLoc = partition(nuts, low, high, bolts[high]);
        partition(bolts, low, high, nuts[pivotLoc]);
        nutsAndBolts(nuts, bolts, low, pivotLoc-1);
        nutsAndBolts(nuts, bolts, pivotLoc+1, high);
    }

    int partition(char[] a, int low, int high, int pivot) {
        int i = low;
        for (int j = low; j< high; j++) {
            if (a[j] < pivot) {
                swap(a, i, j);
                i++;
            } else if (a[j] == pivot) {
                swap(a, j, high);
                j--;
            }
        }
        swap(a, i, high);
        return i;
    }

    void swap(char[] a, int index1, int index2) {
        char temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
