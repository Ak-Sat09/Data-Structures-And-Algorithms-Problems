import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // Create a Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the heap
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(1);

        // Display the heap (automatically sorted as a Min-Heap)
        System.out.println("Heap: " + minHeap);

        // Remove and print elements in sorted order
        while (!minHeap.isEmpty()) {
            System.out.println("Removed: " + minHeap.poll());
        }
        System.out.println("Heap: " + minHeap);
    }
}
