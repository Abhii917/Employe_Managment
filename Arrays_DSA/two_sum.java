package Arrays_DSA;

import java.util.Arrays;

import javax.swing.ImageIcon;

public class two_sum {


    static void check(int[] arr, int target){
        int[] arr2=new int[2];
   
       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                arr2[0]=i;
                arr2[1]=j;
                
            }
            
        }
    
    }
    System.out.println(Arrays.toString(arr2));
    

}
 public static void main(String[] args) {
        int[] arr={2,3,4,5,6,8,9,6,7};
        int target=14;
        check(arr, target);
        
    }
    
}
