// Leetcode 1431

package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class KidsWithCandies {
    public static void main(String[] args) {
        System.out.print("Enter the number of kids: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] candies = new int[len];
        System.out.print("Enter candies: "); 
        for (int i = 0; i < len; i++) {
            candies[i] = in.nextInt();
        }
        System.out.println("Enter the extra candies: ");
        int extraCandies = in.nextInt();
        System.out.println(Arrays.toString(kidCandies(candies, extraCandies)));
        in.close();
    }

    static boolean[] kidCandies(int[] candies, int extraCandies) {
        boolean[] extCandies = new boolean[candies.length];
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            max = i > max ? i : max;
        }
        for (int i = 0; i < extCandies.length; i++) {
            extCandies[i] = (candies[i] + extraCandies) >= max; 
        }
        return extCandies;
    }
}
