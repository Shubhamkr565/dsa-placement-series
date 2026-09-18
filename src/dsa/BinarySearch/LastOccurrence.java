package dsa.BinarySearch;

public class LastOccurrence {

    public static int findLastOccurrence(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;

        while (left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                ans = mid;
                left = mid+1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;



    }


    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,10,10,12,14};
        int target = 10;

        int result = findLastOccurrence(arr, target);

        if(result != -1){
            System.out.println("Last Occurrence of "+target+" is found at index: "+result);
        }else {
            System.out.println("Target: "+target+" not found!");
        }
    }
}
