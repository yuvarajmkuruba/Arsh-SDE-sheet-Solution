package Arrays;

import java.util.Arrays;

public class ChocaleDistrubation {
        public static void main(String[] args) {
        //    int[] arr={12, 4, 7, 9, 2, 23, 25, 41, 
        //     30, 40, 28, 42, 30, 44, 48, 
        //     43, 50};
        // int m=7;
        //    int arr[] = {7, 3, 2, 4, 9, 12, 56} ;
        //    int m=3;
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5 ;
           Arrays.sort(arr);
            int min=Integer.MAX_VALUE;
           for(int i=0;i<arr.length-m+1;i++){
                  if((arr[m+i-1]-arr[i])<min){
                    min=arr[m+i-1]-arr[i];
                  }
           }
           System.out.println(min);
        }
}
