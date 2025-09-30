// Find the Kth largest element in an array using a min-heap.
// Time Complexity: O(N log K), Space Complexity: O(K)

import java.util.PriorityQueue;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();

            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargest kl = new KthLargest();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(kl.findKthLargest(nums, k)); // Output: 5
    }
}
