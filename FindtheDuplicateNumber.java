import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};

        boolean nums[] = new boolean[arr.length+1];

        for(int i=0; i<arr.length; i++){
           if (nums[i] == true) {
            System.out.println(i);
           }
          
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
