package dsa.SlidingWindow;

public class maximumSum2 {

    public static int findMaxSum(int[] nums, int k){
        int left = 0;
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for(int right = 0; right<nums.length; right++){
            windowSum += nums[right];

            if(right - left + 1 == k){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= nums[left];
                left++;
            }

        }



        return maxSum;

    }

    public static void main(String[] args) {

        int[] arr = {10,50,70,40,30,90,20,80};

        int k = 3;

        int result = findMaxSum(arr, k);
        System.out.println( "Maximum sum of " + k + " consecutive elements: " + result );
    }
}
