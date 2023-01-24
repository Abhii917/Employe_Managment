package Arrays_DSA;

public class Min_element_arr {
 public static int Minimum(int[] arr){
    int min=arr[0];
    for(int i=1;i<arr.length;i++){

        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
 }

public static void main(String[] args) {
    int [] arr={34,45,65,23,565,234,75,234,6,1};
    int ans=Minimum(arr);
    System.out.println(ans);

}

    
}
