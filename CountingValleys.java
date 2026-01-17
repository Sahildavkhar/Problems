// https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true

class CountingValleys{
    public static int countingValleys(int steps, String path) {
        int level = 0;
        int valleys = 0;
        for (int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'U'){
                level++;
                if(level == 0){
                    valleys++;
                }
            }
            else if(path.charAt(i) == 'D'){
                level--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int steps = path.length();
        int result = countingValleys(steps, path);
        System.out.println("Number of valleys: " + result);
    }
}