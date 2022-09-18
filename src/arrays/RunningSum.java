// Leetcode 1480

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter elements: "); 
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }   
        System.out.println(Arrays.toString(runningSum(nums)));
        in.close();
    }

    static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
