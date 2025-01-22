import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int arr[] = {2,5,6,3,1,4};
        SelectionSOrt selectionSort = new SelectionSOrt();
        System.out.println(Arrays.toString(arr));

        int i =0;
        while (i < arr.length-1) {

            if(arr[i] > arr[i+1]){

                selectionSort.swap(arr, i, i+1);

                i= 0 ;
                
            }
            else{
                i++;
            }
            
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
