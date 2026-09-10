package dsa.SlidingWindow;

public class MinimumSum {

    public static int findMinSum(int[] nums, int k){
        int left = 0;
        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;

        for(int right=0; right<nums.length; right++){
            windowSum += nums[right];
            if(right - left + 1 == k){
                minSum = Math.min(minSum, windowSum);
                windowSum -= nums[left];
                left++;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] arr= {4,9,3,8,4,6,7,2};

        int k = 3;

        int result = findMinSum(arr, k);
        System.out.println( "Minimum sum of " + k + " consecutive elements: " + result );
    }
}
