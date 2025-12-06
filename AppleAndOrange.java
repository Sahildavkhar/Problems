// AppleAndOrange.java
// Count the number of apples and oranges that fall on a house
// A house is located between points s and t on a number line
// An apple tree is located at point a and an orange tree at point b
// Apples and oranges fall at various distances from their respective trees
// Count how many apples and oranges land on the house

import java.util.List;

public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int numApple = 0;
        int numOrange = 0;
        for(int app : apples){
            if(app + a >= s && app + a <= t){
                numApple++;
            }
        }
        
        for(int orange : oranges){
            if(orange + b >= s && orange + b <= t){
                numOrange++;
            }
        }
        
        System.out.println(numApple+" ");
        System.out.println(numOrange+" ");
    }

    public static void main(String[] args) {
        int s = 7; // start of the house location
        int t = 10; // end of the house location
        int a = 4; // location of the apple tree
        int b = 12; // location of the orange tree
        List<Integer> apples = List.of(2, 3, -4); // distances of apples from the tree
        List<Integer> oranges = List.of(3, -2, -4); // distances of oranges from the tree

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
