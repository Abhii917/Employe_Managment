package Arrays_DSA;

import java.util.Scanner;

public class count_occurd_elements {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,1,1,1,3,4,5,4,3,4,};
        int count=0;
        System.out.println("enter the element to check repition");
        int rep=sc.nextInt();
        

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==rep){
                count++;
            }
        

        }
        System.out.println("the elment "+rep+" is occured in array for "+count+" times  : )");
    }
    
}
