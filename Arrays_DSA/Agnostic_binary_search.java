package Arrays_DSA;

public class Agnostic_binary_search {

static int binarySearch2(int[] arr, int target){
    int start=0;
    int end=arr.length-1;
    int mid=(start+end)/2;
    boolean isArr=arr[start]<arr[end];

     

        if(isArr)
        {

             if(target<arr[mid])
            {
            
            end=mid-1;

            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
         }
        
         else{
        
            if(target>arr[mid]){
                
                end=mid-1;
    
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
             
            }
            if(arr[mid]==target)
     {
        return mid;
     }

         return -1;
        }
        
        public static void main(String[] args) {
            int[] arr={87,65,43,32,31,25,23,20,11,9,4};
           //int[] arr={-12,-11,-7,-4,1,3,4,18,23,45,67,85};
            int target=20;
            int ans=binarySearch2(arr, target);
            System.out.println(ans);
        }
    
    }
 
    





    
