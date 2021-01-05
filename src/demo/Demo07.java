package demo;

public class Demo07 {
    public static int search(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        int mid;

        if(key < arr[low] || key > arr[high]){
            return -1;
        }

        while(low <= high){
            mid = (low+high)/2;
            if(key < arr[mid]){
                high = mid - 1;
            }else if(key > arr[mid]){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,22,33,55,65,78,890};
        System.out.println(search(arr,78));
    }
}
