import java.util.*;

public class MajorityElement {
    public int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i], 1);
            }
            else{
                if(map.get(arr[i]) >= arr.length / 2){
                    return arr[i];
                }
                else{
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int arr[] = {3, 2, 3};
        System.out.println("Majority Element is: " + me.majorityElement(arr));
    }
}
