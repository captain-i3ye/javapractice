// Leetcode 1389

package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        System.out.print("Enter length of arrays: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] nums = new int[len], index = new int[len];
        System.out.print("Enter elements of nums: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("Enter elements of index: ");
        for (int i = 0; i < index.length; i++) {
            index[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(targetArray(nums, index)));
        in.close();
    }

    static int[] targetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>(nums.length);
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < index.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
