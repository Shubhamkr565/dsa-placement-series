/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the a
 */

package dsa.arrays;

public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 3};
        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element: " + findMajorityElement(arr1)); // Output: 3
        System.out.println("Majority Element: " + findMajorityElement(arr2)); // Output: 2
    }
}
