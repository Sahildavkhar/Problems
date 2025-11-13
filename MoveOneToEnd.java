// 3228. Move All '1's to the End of the String
// Difficulty: Medium

public class MoveOneToEnd {
    public int maxOperations(String s) {
        int countOne = 0;
        int ans = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '0'){
                while(i + 1 < s.length() && s.charAt(i + 1) == '0'){
                    i++;
                }
                ans = ans + countOne;
            }
            else{
                countOne++;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args){
        MoveOneToEnd solution = new MoveOneToEnd();
        String s = "00110011";
        int result = solution.maxOperations(s);
        System.out.print("Maximum opeartions:" + result);    
    }
}
