package Arrays_DSA;

public class Linear_serch {
    public void main(String[] args) {
        int arr[]={12,34,54,76,567,765,11};
        int check=11;
        int index=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==check){
               
                
                System.out.println("element which you are searching for is present in array at index of:"+index);
            }
            else{
             System.out.println("not found");
            }


                     index++;
        
        
        
        }

    
}}
