package Arrays_DSA;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;

public class insertion_arr {
    public static void main(String[] args) {
        System.out.println("before insertion:");
        int[] arr={34,23,45,56};
        System.out.println(Arrays.toString(arr));
        int el=4444;
        int pos=3;
        for(int i=arr.length-1;i<pos-1;i--){

            arr[i+1]=arr[i];

        }
        arr[pos-1]=el;
        System.out.println("after inserting");
        
        System.out.println(Arrays.toString(arr));



        }
    
    
}
