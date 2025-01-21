
public class MinimiumCommon {
    public static void main(String[] args) {
        int arr1[] = {1,2,3 ,6};
        int arr2[] = {2,3 ,4 ,5};
//nums1 = [1,2,3,6], nums2 = [2,3,4,5]
        int min = Integer.MAX_VALUE;

        int i =0;
        int j = 0;

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] == arr2[j] && arr1[i] < min) {
                min = arr1[i];
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
       System.out.println(min);
    }
    
}
