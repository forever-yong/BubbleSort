package demo;

import java.util.Arrays;

public class Demo05 {
    public static int[] bubbleSort(int[] arr) {
        int i, j, temp, len = arr.length;
        for (i = 0; i < len - 1; i++)
            for (j = 0; j < len - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {23,99,23,123,43,2,456,4555,2,44,55,666,55,4,444};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
