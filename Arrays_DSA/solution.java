package Arrays_DSA;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static void rearrange(int arr[], int n) {
       // ArrayList<Integer> pos = new ArrayList<Integer>();
        //ArrayList<Integer> neg = new ArrayList<Integer>();
        int[] pos=new int[5];
        int[] neg=new int[5];
        int pos_ind=0;
        int neg_ind=0;
    for(int i=0; i<arr.length-1;i++){

        if(arr[i]>0){
            pos[pos_ind]= arr[i];
            pos_ind++;

        }
        else if(arr[i]<0){
            pos[neg_ind]=arr[i];
            neg_ind++;

        }
        else{
            System.out.println("hchgdhh");
        }
    }  
    System.out.println(Arrays.toString(pos));
    System.out.println(Arrays.toString(neg));
   
}
public static void main(String[] args) {
    int[] arr={-1,2,-3,4-5,2,-5,-8,5,4};
    int n=11;
    rearrange(arr, n);
   

    
}
}

