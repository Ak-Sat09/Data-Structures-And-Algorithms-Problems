 

public class ThirdLargestNumber {

    public static void main(String[] args) {
        int arr[] = {4,3,2,2,3,1};
  

        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        int Tmax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
             
            Smax = max;
            if(arr[i] >= max ){
                max = arr[i];
            } 
        }
        System.out.println(max);
        System.out.println(Smax);
        System.out.println(Tmax);
    }
    
}
