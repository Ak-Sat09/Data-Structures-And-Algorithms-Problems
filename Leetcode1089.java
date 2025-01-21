import java.util.Arrays;

public class Leetcode1089 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5};
         int result[] = arr.clone();

         int i = 0;
         int j = 0;
         while (j<arr.length) {
            if(result[i] == 0){
                arr[j] = 0;
                j++;
                if(j < arr.length){
                    arr[j] = 0;
                }
                else
                arr[j] = result[i];
            j++;
            i++;
            }
         }
         System.out.println(Arrays.toString(arr));
    }
    
}
