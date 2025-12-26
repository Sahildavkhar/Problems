// https://leetcode.com/problems/minimum-penalty-for-a-shop/description/?envType=daily-question&envId=2025-12-26

public class MinimumPenalty {
    public int bestClosingTime(String customers) {
        int minPenalty = 0;
        int curPenalty = 0;
        int earliestHour = 0;

        for(int i = 0; i < customers.length(); i++){
            char ch = customers.charAt(i);
            if(ch == 'Y'){
                curPenalty--;
            }
            else{
                curPenalty++;
            }

            if(curPenalty < minPenalty){
                earliestHour = i + 1;
                minPenalty = curPenalty;
            }
        }
        return earliestHour;
    }

    public static void main(String[] args) {
        MinimumPenalty mp = new MinimumPenalty();
        String customers = "YYNY";
        System.out.println("Best Closing Time: " + mp.bestClosingTime(customers));
    }
}
