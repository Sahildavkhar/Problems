// Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

// The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

// The task is to calculate their comparison points by comparing each category:

// If a[i] > b[i], then Alice is awarded 1 point.
// If a[i] < b[i], then Bob is awarded 1 point.
// If a[i] = b[i], then neither person receives a point.

// Example
// a = [1, 2, 3]
// b = [3, 2, 1]

// For elements *0*, Bob is awarded a point because a[0] < b[0].
// For the equal elements a[1] and b[1], no points are earned.
// Finally, for elements 2, a[2] > b[2] so Alice receives a point.
// The return array is [1, 1] with Alice's score first and Bob's second.

import java.util.*;

class compareTriplets{
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int acount = 0;
        int bcount = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                acount++;
            }
            if(a.get(i) < b.get(i)){
                bcount++;
            }
        }
        return Arrays.asList(acount,bcount);
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);
        List<Integer> result = compareTriplets(a, b);
        System.out.println("Comparison Result: " + result);
    }
}