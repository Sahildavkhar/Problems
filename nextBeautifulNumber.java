class nextBeautifulNumber {
    public int nextBeautifulNumber(int n) {
        for(int i = n + 1; i <= 1224444; i++){
            if(isBalance(i)){
                return i;
            }
        }
        return -1;        
    }

    private boolean isBalance(int x){
        int[] arr = new int[10];
        while(x > 0){
            arr[x % 10]++;
            x = x / 10;
        }
        for(int i = 0; i < 10; i++){
            if(arr[i] > 0 && arr[i] != i){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        nextBeautifulNumber solution = new nextBeautifulNumber();
        int n = 1;
        System.out.print(""+solution.nextBeautifulNumber(n));
    }
}