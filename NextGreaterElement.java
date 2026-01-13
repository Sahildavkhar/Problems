// https://leetcode.com/problems/next-greater-element-i/description/

import java.util.*;

class NextGreaterElement{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ng = new HashMap<>();
        Deque<Integer> st = new ArrayDeque<>();

        for(int num : nums2){
            while(!st.isEmpty() && st.peek() < num){
                ng.put(st.pop(), num);
            }
            st.push(num);
        }

        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = ng.getOrDefault(nums1[i], -1);
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreaterElement solution = new NextGreaterElement();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}