import java.util.Arrays;

public class SelectionSOrt {

    public  void swap(int arr[] , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
     }
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,5};
        int left = 0;
        int right = arr.length-1;

        System.out.println(Arrays.toString(arr));

        while (left <= right) {

            if(arr[left] >= arr[right]){
                swap(arr, left, right);
                left++;
                right--;
            }
            else{
                left++;
                right--;
            } 
            
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
