package dsa.BinarySearch;

public class PeakElement {

    public static int findPeekElement(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while (left<right){
            int mid = left+(right-left)/2;

            if(nums[mid] < nums[mid+1]){
//            peek element must be right side
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4};

        int result = findPeekElement(arr);

        System.out.println("Peek Element: "+result);
    }
}
