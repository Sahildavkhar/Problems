// Count the number of square sum triples (a, b, c) such that a^2 + b^2 = c^2 and 1 <= a, b, c <= n
// A square sum triple consists of three integers (a, b, c) where the sum of the squares of a and b equals the square of c.
// This program counts all such triples for a given n.
// For example, for n = 5, the valid triples are (3, 4, 5) and (4, 3, 5).
// The method countTriples calculates the number of such triples.

import java.util.HashSet;

public class SquareSumTriples {
    public int countTriples(int n) {
        int count = 0;
        HashSet<Integer> square = new HashSet<>();
        for(int i = 0; i <= n; i++){
            square.add(i * i);
        }
        for(int i = 1; i <= n; i++){
            int a2 = i * i;
            for(int j = 1; j <= n; j++){
                int sum = a2 + j * j;

                if(square.contains(sum)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SquareSumTriples sst = new SquareSumTriples();
        int n = 5;
        int result = sst.countTriples(n);
        System.out.println("Count of square sum triples for n = " + n + ": " + result);
    }
}
