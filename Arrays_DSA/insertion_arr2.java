package Arrays_DSA;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;


public class insertion_arr2 {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of element in array:");
    
    int size=sc.nextInt();
    int[] arr=new int[size];
    int[] arr2=new int[size+1];

    System.out.println("enter the array elements:");
    for(int i=0;i<size;i++){

         arr[i]=sc.nextInt();
    }

         System.out.println("enter the position where you want to insert elements:");
  int pos=sc.nextInt();

  System.out.println("enter the element that you want to insert");
 int ele=sc.nextInt();
 for(int j=0;j<arr.length+1;j++){


       if(j<pos){
        arr2[j]=arr[j];
    }

    else if(j==pos){
        arr2[j]=ele;
    }
    else{
        arr2[j]=arr[j-1];
    }

 }
   System.out.println("array after insertion is:");
   System.out.println(Arrays.toString(arr2));
   }



}
        

    

