public class Looping {
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,4,6};

        int minSum = Integer.MAX_VALUE;

        int i =0;
        for(int j=1; j<arr.length; j++){
            if (arr[i] + arr[j] < minSum) {
                minSum = arr[i]+arr[j];
                i++;
                
            }
        }
        System.out.println(minSum);
    }
    
}
