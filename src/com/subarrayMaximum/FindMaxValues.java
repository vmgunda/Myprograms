package com.subarrayMaximum;

import java.lang.reflect.Array;

public class FindMaxValues {

    static Integer[] array =  {6, -3, -10, 0, 2};

    public static void main(String[] args) {
        int maxValue = array[0];
        int minValue = array[0];
        int maxProduct = array[0];
        for (int i=1;i <= array.length-1; i++) {
            if (array[i] < 0) {
                int temp = maxValue;
                maxValue = minValue;
                minValue = temp;
            }
            System.out.println("#################");
            System.out.println("Array Value: " + array[i]);
            maxValue = Math.max(array[i], maxValue * array[i]);
            System.out.println("Maximum Value: " + maxValue);
            minValue = Math.min(array[i], minValue * array[i]);
            System.out.println("Minimum  Value: " + minValue);
            maxProduct = Math.max(maxProduct, maxValue);
            System.out.println("#################");
        }

        System.out.println("Maximum Product: " + maxProduct);

    }
}
