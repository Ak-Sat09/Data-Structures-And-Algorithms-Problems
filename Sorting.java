import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};

        int n = nums.length;

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        list.add( nums[n - 3]);
        list.add( nums[n - 2]);
        list.add( nums[n - 1]);
        
        System.out.println(Arrays.toString(nums));
        System.out.println(list);
         
    }    
}
