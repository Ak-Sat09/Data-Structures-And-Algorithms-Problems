 
import java.util.Arrays;

public class SelctionSort {
    public static void swap(int arr[] , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args) {
         int arr[] = {2,5,1,6,11,10};
        int i = 0;
         
        int min = Integer.MAX_VALUE;

        for(int j=0; j<arr.length-1; j++){
 

            if (arr[j] < min)  {
               min = arr[j];
               swap(arr, min, i);
               if(i<arr.length)i++;
               min = Integer.MAX_VALUE;
            }
            
            
             

        }
        System.out.println(Arrays.toString(arr)); 
    }
    
}
