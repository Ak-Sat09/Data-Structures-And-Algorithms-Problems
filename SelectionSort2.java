import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int arr[] ={4,5,2,1,6,3};
        SelectionSOrt selectionSort = new SelectionSOrt();
        System.out.println(Arrays.toString(arr));

        int i=0;

        
            for(int j=1; j<arr.length; j++){

                if(arr[i] > arr[j]){
                    j++;
                }
                
            }
        
        System.out.println(Arrays.toString(arr)); 
    }
    
}
