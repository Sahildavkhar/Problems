// https://leetcode.com/problems/next-greater-element-ii/description/?source=submission-ac

import java.util.*;

class NextGreaterElement{
    public int[] nextGreaterElements(int[] arr) {
    int n = arr.length;
    int[] ans = new int[n];
    Arrays.fill(ans, -1);

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < 2 * n; i++) {
        int num = arr[i % n];

        while (!stack.isEmpty() && arr[stack.peek()] < num) {
            ans[stack.pop()] = num;
        }

        if (i < n) {
            stack.push(i);
        }
    }
    return ans;
    }

    public static void main(String[] args) {
        NextGreaterElement solution = new NextGreaterElement();
        int[] arr = {1, 2, 1};
        int[] result = solution.nextGreaterElements(arr);
        System.out.println(Arrays.toString(result));
    }
}