//  Given an array of positive integers and an integer K,
//  find the length of the longest contiguous subarray whose sum is ≤ K.

package dsa.SlidingWindow;

public class longestContiguousSubarray {

    public static void findLongestSubarray(int[] nums, int k){
        int left = 0;
        int windowSum = 0;
        int maxLength = 0;
        for(int right = 0; right <nums.length; right++){
            windowSum += nums[right];

            while (windowSum>k){
                windowSum -= nums[left];
                left++;
            }

            int currentLength = right-left+1;
            maxLength = Math.max(maxLength, currentLength);
        }
        System.out.println("Max Length of ContigousSubarray: "+maxLength);

    }


    public static void main(String[] args) {

        int[] arr = {2,1,5,2,3,2};
        int k = 7;

        findLongestSubarray(arr, k);
    }

}
