package dsa.TwoPointers;

public class PairSum {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6, 8, 10, 12};
        int target = 14;

        int left = 0;
        int right = nums.length-1;

        while (left < right){

            int sum  = nums[left] + nums[right];

            if(sum == target){
                System.out.println(nums[left]+","+nums[right]);
                left++;
                right--;
            }else  if(sum < target){
                left++;
            }else {
                right--;
            }

        }

    }
}
