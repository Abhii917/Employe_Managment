package Arrays_DSA;
import java.util.Arrays;

public class mov_neg_left_arr {
 public static void main(String[] args) {
    int  arr[]={23,-43,-23,35,22,33,-44,33,-43};

    int left=0; 
    int right=arr.length-1;
 while(left<=right ){

   
   
     while(arr[left]<0){
        left++;
        
         }
         while(arr[right]>0){
          right--;
         
        }
        if(left>=right){
         break;
        }
         
          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;



 }
 System.out.println(Arrays.toString(arr));

    }
 
}






