// Minimum Time to Make Rope Colorful
// https://leetcode.com/problems/minimum-time-to-make-rope-colorful/

public class ColorfulRope {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int currMaxTime = 0;

        for(int i = 0; i < colors.length(); i++){
            if(i > 0 && colors.charAt(i) != colors.charAt(i - 1)){
                currMaxTime = 0;
            }
            totalTime = totalTime + Math.min(currMaxTime, neededTime[i]);
            currMaxTime = Math.max(currMaxTime, neededTime[i]);
        }
        return totalTime;
    }

    public static void main(String[] args) {
        ColorfulRope cr = new ColorfulRope();
        String colors = "aabaa";
        int[] neededTime = {1,2,3,4,1};
        System.out.print(cr.minCost(colors, neededTime));
    }
}
