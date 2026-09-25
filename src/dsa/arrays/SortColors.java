/*
You are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

Example 1:

Input: nums = [2,0,2,1,1,0]

Output: [0,0,1,1,2,2]
 */


package dsa.arrays;

import java.util.Arrays;

public class SortColors {

    public static void SortedArr(int[] nums){

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        for(int n: nums){
            System.out.print(n+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};

        SortedArr(arr);
    }
}
