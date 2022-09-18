// Leetcode 1470

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter elements: "); 
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums)));
        in.close();
    }

    static int[] shuffle(int[] nums) {
        int[] ans = new int[nums.length];
        int t1 = 0, t2 = nums.length/2;
        for (int i = 0; i < ans.length-1; i++) {
            ans[i] = nums[t1];
            ans[i+1] = nums[t2];
            t1++; t2++; i++;
        }
        return ans;
    }
}
