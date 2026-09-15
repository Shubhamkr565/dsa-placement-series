//Give a sorted array find target element.
package dsa.BinarySearch;

public class BinarySearch1 {

    public static int findTarget(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int mid = left + (right-left)/2;


            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left= mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int target = 12;

        int result =  findTarget(arr, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found.");
        }


    }
}
