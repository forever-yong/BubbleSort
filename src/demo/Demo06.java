package demo;

import java.util.Arrays;

public class Demo06 {
    public static int[] bobo(int[] arr){
        int num;

        for (int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length-1-k; i++) {
                if(arr[i] > arr[i+1]){
                    num = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = num;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6,10,222,11,22,999,876};
        System.out.println(Arrays.toString(bobo(arr)));
    }
}
