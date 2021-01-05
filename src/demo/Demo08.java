package demo;

public class Demo08 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,44,55,77,88,98};
        System.out.println(opp(arr,98));
    }

    public static int opp(int arr[],int key){
      int min = 0;
      int max = arr.length-1;
      int mid ;

      if(key<arr[min] || key>arr[max]){
          return -1;
      }

      while (max >= min){
         mid = (min+max)/2;
          if(key<arr[mid]){
              max = mid-1;
          }else if (key>arr[mid]){
              min = mid+1;
          }else {
              return mid;
          }
      }
      return -1;
    }
}
