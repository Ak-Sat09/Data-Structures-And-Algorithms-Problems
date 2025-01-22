import java.util.Arrays;

public class BubbleSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 1, 6, 3};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        int i = 0; // Start from the first index
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1); // Swap if the current element is greater
                i = 0; // Reset the index to start over
            } else {
                i++; // Move to the next index
            }
        }

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
