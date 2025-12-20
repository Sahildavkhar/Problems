// https://leetcode.com/problems/delete-columns-to-make-sorted/description/?envType=daily-question&envId=2025-12-20

public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        for(int j = 0; j < strs[0].length(); j++){
            res = res + isUnsorted(strs, j);
        }
        return res;
    }

    private int isUnsorted(String[] strs, int j){
        for(int i = 1; i < strs.length; i++){
            if(strs[i].charAt(j) < strs[i - 1].charAt(j)){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        DeleteColumnsToMakeSorted solution = new DeleteColumnsToMakeSorted();
        String[] strs = {"cba", "daf", "ghi"};
        int result = solution.minDeletionSize(strs);
        System.out.println("Minimum number of columns to delete: " + result);
    }
}
