package Arrays_DSA;

import java.lang.annotation.Target;

public class Binaray_Srch_sorted_arr {

 static int binarySearch(int[] arr, int target){
    int start=0;
    int end=arr.length-1;
     while(start<=end){

        int mid=(start+end)/2;

         if(target<arr[mid]){
            end=mid-1;
         }

         else if(target > arr[mid]){
            start=mid+1;
         }

         else{
            return mid;
         }
   }

 return -1;
}
 public static void main(String[] args) {
    int[] arr={-12,-11,-7,-4,1,3,4,18,23,45,67,85};
    int target=3;
    int ans= binarySearch(arr, target);
    System.out.println(ans);
    
 }

}
