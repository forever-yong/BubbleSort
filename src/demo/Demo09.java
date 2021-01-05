package demo;

public class Demo09 {
    public static void main(String[] args) {

        int[] arr = {22,33,44,55,66,77,88};
        System.out.println(bbo(arr,29));
    }

    public static int bbo(int[] arr,int key){
        int min = 0;
        int max = arr.length-1;
        int mid;

        if(key<arr[min]||key>arr[max]){
            return -1;
        }

        while(arr[min]<=arr[max]){
            mid = (min+max)/2;
            if(key>arr[mid]){
                min = mid+1;
            }else if (key<arr[mid]){
                max = mid-1;
            }else {
                return mid;
            }
        }
        return -100;
    }
}
