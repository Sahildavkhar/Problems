import java.util.*;

public class RemoveDuplicates1 {
    public void removeDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                System.out.print(num + "");
            }
        }        
    }

    public static void main(String[] args){
        RemoveDuplicates1 obj = new RemoveDuplicates1();
        int[] nums = {1,1,2,2,3,4,4,5};
        obj.removeDuplicates(nums);
    }
}
