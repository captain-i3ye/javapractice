// Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
// Greatest element < length of array.
// Smallest element > -1.
// Leetcode 1920

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayPerm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int len = in.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    static int[] buildArray(int nums[]) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
