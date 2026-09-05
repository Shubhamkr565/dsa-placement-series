package dsa.TwoPointers;

public class removeDuplicates {

    // Method to remove duplicates from sorted array
    public static int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        // Slow pointer keeps track of unique elements
        int slow = 0;

        // Fast pointer checks every element
        for(int fast = 1; fast<nums.length; fast++){
            // If current element is different from previous unique element
            if(nums[slow] != nums[fast]){
                slow++;

                // Store the new unique element
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }



    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,4,5};

        System.out.println("Original Array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

        // Remove duplicates and get count of unique elements
        int k = removeDuplicates(arr);

        System.out.println("\nAfter remove Duplicates values: ");
        for(int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }
}