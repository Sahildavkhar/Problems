// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true

class CatAndMouse{
    public static String catAndMouse(int x, int y, int z){
        int catAdiff = Math.abs(z - x);
        int catBdiff = Math.abs(z - y);
        
        if(catAdiff < catBdiff){
            return "Cat A";
        }
        else if(catBdiff < catAdiff){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }
    }

    public static void main(String[] args) {
        int x = 1; // Cat A position
        int y = 2; // Cat B position
        int z = 3; // Mouse C position

        String result = catAndMouse(x, y, z);
        System.out.println(result); // Output: Cat B
    }
}