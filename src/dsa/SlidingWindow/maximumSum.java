//Find the maximum sum of any contiguous subarray of size K.


package dsa.SlidingWindow;

import static java.lang.Long.max;


public class maximumSum {

    public static void maxSum(int[] nums, int e) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int right = 0; right<nums.length; right++){
            sum += nums[right];
            if(right-left+1 == e){
                max = Math.max(max, sum);
                sum -=nums[left];
                left++;
            }

        }

        System.out.println("Max_Sum: "+max);

    }


    public static void main(String[] args) {

        int[] arr = {2,8,4,9,3,7};
        int k =3;

        maxSum(arr, k);
    }

}


