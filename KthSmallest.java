import java.util.*;

public class KthSmallest {
    public static int kthSmallest(int[] nums, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        for(int num : nums){
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();        
    }

    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.print("" + kthSmallest(nums, k));
    }
}
