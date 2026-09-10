//Find the length of the longest contiguous subarray whose sum is less than or equal to 7.

package dsa.SlidingWindow;

public class Variable1 {

    public static int findlength(int[] nums, int k){
        int left = 0;
        int windowSum = 0;
        int maxLength = 0;

        for(int right=0; right<nums.length; right++){
            windowSum += nums[right];

            while (windowSum > k){
                windowSum -= nums[left];
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};

        int k = 7;

        int result = findlength(arr, k);
        System.out.println("Longest Contiguous subarray: "+result);
    }
}
