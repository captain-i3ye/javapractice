// Leetcode 1929

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenation {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter elements: ");
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(getConcat(nums)));
    }

    static int[] getConcat(int[] nums) {
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
