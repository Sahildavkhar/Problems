// https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

class Electronic{
     static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int current = 0;
        int max = -1;
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                if(keyboards[i] + drives[j] <= b){
                    current = keyboards[i] + drives[j];
                    max = Math.max(max, current);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int b = 60;
        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println("Maximum money spent: " + moneySpent);
    }
}