package Arrays_DSA;
import java.util.Arrays;
import java.util.Scanner;

public class remove_ele_arr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int arr[]={1,2,3,7,4,5,6};
    int arr2[]=new int[arr.length-1];
         System.out.println("enter the index to remove element:");
         int pos=sc.nextInt();

         for(int i=0;i<arr.length;i++){
            if(i<pos){
                arr2[i]=arr[i];
            }
            else if(i==pos){
                //arr2[i]=arr[i+1];
                continue;
            }
            else{
                arr2[i-1]=arr[i];
            }

         }
         
         System.out.println(Arrays.toString(arr2));





    }
    
}
