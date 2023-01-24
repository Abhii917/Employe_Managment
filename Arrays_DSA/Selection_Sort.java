package Arrays_DSA;

import java.util.Arrays;

public class Selection_Sort {

    public static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j])
                {
                  small=j;
                }
                int temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
            }
        }

 }
        public static void main(String[] args) {
        int arr[]={2,34,3212,345,432,345,4321,234,6,5,43,2,23,45,65,432,123456};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
