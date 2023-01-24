package Arrays_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class shifting_arry_to_right {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be shifted");
        int shft=sc.nextInt();
    
       for(int i=1;i<=shft;i++){

        int st=arr[arr.length-1];
        for(int j=arr.length-1;j>0;j--){
        
           arr[j]=arr[j-1];
           
        }
        arr[0]=st;
    }
    System.out.println(Arrays.toString(arr));

        
    }
    
    
}
