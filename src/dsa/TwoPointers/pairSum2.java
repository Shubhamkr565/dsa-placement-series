package dsa.TwoPointers;

import java.util.Scanner;

public class pairSum2 {

    public static void pairSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println(
                        nums[left] + " + " + nums[right] + " = " + target
                );
                break;

            } else if (sum < target) {
                left++;

            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number: " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target value: ");
        int target = sc.nextInt();

        pairSum(arr, target);
    }
}