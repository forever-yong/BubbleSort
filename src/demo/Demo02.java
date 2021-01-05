package demo;

import java.util.Arrays;
import java.util.Random;

/**
 * 面试题：从非常大量的一组数据当中找出前100名
 */
public class Demo02 {
    public static void main(String[] args) {
        /*
         * 这儿演示的是从100个数中取前5个最大的。
         * 如果数更多，算法逻辑是一样的。
         */
        //arr用于存放前5个最大的数
        int[] arr = new int[5];
        Random random =new Random();
        for (int i = 0; i < 100; i++) {
            //从100个数中每次取一个数(模拟从大量数据中取一个)
            int number = random.nextInt(10000);
            //获得插入位置
            int index = Arrays.binarySearch(arr,number);
            if(index == 0 || index == -1){
                //number小于或者等于当前最小数,则不用插入
                continue;
            }
            //还原实际插入位置
            if(index < 0){
                index = -(index+1);
            }
            //移动元素(将最小的移走)
            for (int j = 1; j <index ; j++) {
                arr[j-1] = arr[j];
            }
            arr[index - 1] = number;
            System.out.println("arr:"+Arrays.toString(arr));
        }
        System.out.println("arr:"+Arrays.toString(arr));
    }
}
