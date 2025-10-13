// https://www.hackerearth.com/problem/algorithm/favourite-singer-1-3/

import java.util.*;

class FavouriteSinger {
    public static long Singers(long[] arr, long N) {
        HashMap<Long, Long> map = new HashMap<>();
        long maxCount = 0;

        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0L) + 1);
            maxCount = Math.max(maxCount, map.get(arr[i]));
        }

        long favCount = 0;
        for (long count : map.values()) {
            if (count == maxCount)
                favCount++;
        }

        return favCount;
    }


    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] arr = new long[(int)N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextLong();
        }
        System.out.print("" +Singers(arr, N));
    }
}
