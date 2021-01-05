package demo;

import java.util.Arrays;

/**
 * 演示Arrays.binarySearch方法的特点
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {2,6,18,22,35,99};
        int index = Arrays.binarySearch(arr,18);
        System.out.println("index:" + index);

        int[] arr2 = {2,6,6,18,22,35,99};
        int index2 = Arrays.binarySearch(arr2,6);
        System.out.println("index2:" + index2);

        int[] arr3 = {2,6,16,18,22,35,99};
        int index3 = Arrays.binarySearch(arr3,100);
        System.out.println("index3:" + index3);

        int[] arr4 = {0,0,0,0,0};
        int index4 = Arrays.binarySearch(arr4,88);
        System.out.println("index4:" + index4);
    }
}
