package dsa.BinarySearch;

public class CountOccurrences {

    public static int findCountOccurrences(int[] nums, int target){

        int first = findFirstOccurrence(nums, target);

        if(first == -1){
            return 0;
        }
        int last = findLastOccurrence(nums, target);

        return last-first+1;
    }

    public static int findFirstOccurrence(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int first = -1;

        while (left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid] == target){
                first = mid;
                right = mid-1;
            } else if (nums[mid] < target) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return first;
    }

    public static int findLastOccurrence(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;
        int last = -1;

        while (left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid] == target){
                last = mid;
                left = mid+1;
            } else if (nums[mid] < target) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return last;

    }


    public static void main(String[] args) {
        int[] arr = {2,4,4,4,4,4,6,8};
        int target = 4;

        int result = findCountOccurrences(arr, target);

        System.out.println("Total Count: "+ result);
    }
}
