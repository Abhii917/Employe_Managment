package Arrays_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class shifting_array {public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);

    int arr[]={2,4,6,8,10,12,14,16,18,203};
 System.out.println("enter the number to shift array:");
  int n=sc.nextInt();
  
  for(int i=0;i<n;i++){
   
    int a=arr[0];
  for(int j=0;j<arr.length-1;j++){

        arr[j]=arr[j+1];

    }
    arr[arr.length-1]=a;

  }


  System.out.println(Arrays.toString(arr));

    
}
}