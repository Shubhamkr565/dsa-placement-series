//Average of every window of size K

package dsa.SlidingWindow;

public class AverageOfWindow {

    public static double findAverageWindow(int[] nums, int k){
        int left = 0;
        int windowSum = 0;
        int count = 0;
        int sum = 0;
        double average = 0.0;

        for(int right=0; right<nums.length; right++){
            windowSum += nums[right];

            if(right - left + 1 == k){
                sum += windowSum;
                count++;
                windowSum -= nums[left];
                left++;
            }
        }

        average = (double)sum/count;
        return average;
    }


    public static void main(String[] args) {
        int[] arr = {5,7,9,1,5,3,4,9,2};
        int k = 3;

        double result = findAverageWindow(arr, k);
        System.out.println("Average of Window is: "+result);
    }
}
