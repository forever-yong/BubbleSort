package demo;

/**
 * 二分查找算法
 */
public class Demo04 {
    public static int binarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        int middle;
        if(key < arr[low] || key > arr[high]){
            return -1;
        }
        while(low<=high) {
            middle = (low + high) / 2;
            if (key > arr[middle]) {
                low = middle + 1;
            } else if (key < arr[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,11,22,66,99,120};
        int index = binarySearch(arr,3);
        System.out.println("index:" + index);
    }
}
