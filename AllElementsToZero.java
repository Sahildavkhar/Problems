// 3542. Minimum Operations to Convert All Elements to Zero

import java.util.ArrayList;
import java.util.List;

public class AllElementsToZero {
    public int minOperations(int[] nums) {
        List<Integer> s = new ArrayList<>();
        int res = 0;
        for(int a : nums){
            while(!s.isEmpty() && s.get(s.size() - 1) > a){
                s.remove(s.size() - 1);
            }
            if(a == 0){
                continue;
            }
            if(s.isEmpty() || s.get(s.size() - 1) < a){
                res++;
                s.add(a);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        AllElementsToZero solution = new AllElementsToZero();
        int[] nums = {1, 5, 0, 3, 5};
        int result = solution.minOperations(nums);
        System.out.println("Minimum operations to make all elements zero: " + result);
    }
}
