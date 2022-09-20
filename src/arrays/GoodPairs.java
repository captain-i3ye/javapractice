// Leetcode 1512

package arrays;

import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("No. of good pairs: " + goodPairs(nums));
        in.close();
    }

    static int goodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }
}
