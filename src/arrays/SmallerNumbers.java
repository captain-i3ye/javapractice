// Leetcode 1365

package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SmallerNumbers {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
           nums[i] = in.nextInt(); 
        }
        System.out.println(Arrays.toString(smallerNumbers(nums)));
        in.close();
    }

    static int[] smallerNumbers(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
