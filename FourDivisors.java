// `https://leetcode.com/problems/sum-of-numbers-with-four-divisors/description/?envType=daily-question&envId=2024-06-12`

public class FourDivisors {
    public int sumFourDivisors(int[] nums) {
        int res = 0;

        for(int num : nums){
            if(sumOne(num) != -1){
                res = res + sumOne(num);
            }
        }
        return res;
    }

    private int sumOne(int n){
        int p = (int) Math.round(Math.cbrt(n));
        if((long) p * p * p == n && isPrime(p)){
            return 1 + p + p * p + p * p * p;
        }

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                int a = i;
                int b = n / i;
                if(a != b && isPrime(a) && isPrime(b)){
                    return 1 + a + b + n;
                }
                return -1;
            }
        }
        return -1;
    }

    private boolean isPrime(int x){
        if(x < 2){
            return false;
        }
        for(int i = 2; i * i <= x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FourDivisors solution = new FourDivisors();
        int[] nums = {21,4,7};
        int result = solution.sumFourDivisors(nums);
        System.out.println(result);
    }
}
