import java.util.TreeSet;

public class Freq { 
    public static void main(String[] args) {
        
    int arr[] = {1,1,2,2,2,3,4};

    TreeSet<Integer> set = new TreeSet<>();
    for(int i : arr){
        set.add(i);
        if (set.size()>3) {
            System.out.println(set.pollFirst());
        }

        if (set.size()<3) {
System.out.println(set.pollLast());
        }
    }
   
   
    }
    
}
