package dsa.BinarySearch;

public class FirstOccurrence {

    public static int findFirstOccurrence(int[] nums, int target){
        int left= 0;
        int right = nums.length-1;
        int ans = -1;

        while (left<=right){
            int mid = left+ (right-left)/2;

            if(nums[mid] == target){
                ans = mid;
                right = mid-1;

            } else if (nums[mid] > target) {
                right = mid-1;
            }else{
                left = left+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 8, 10};
        int target = 4;

        int result = findFirstOccurrence(arr, target);

        if (result != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + result);
        } else {
            System.out.println("Target " + target + " not found");
        }
    }
}
