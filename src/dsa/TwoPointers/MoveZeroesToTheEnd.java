package dsa.TwoPointers;

public class MoveZeroesToTheEnd {

    // Method to move all zeroes to the end of the array
    public static void MoveZeroesToTheEnd(int[] nums){
        if(nums.length == 0){
            System.out.println("Empty array: ");
            return;

        }

        // Slow pointer tells where the next non-zero element should go
        int slow = 0;

        // Fast pointer checks every element of the array
        for(int fast = 0; fast<nums.length; fast++){
            if(nums[fast] != 0){

                // Swap the non-zero element with the element at slow
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }







    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4};

        System.out.println("Original Array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

        MoveZeroesToTheEnd(arr);
        System.out.println("\nAfter Move Zero To The End: ");
        for(int num: arr){
            System.out.print(num +" ");
        }

    }
}


/*
slow → position where next non-zero goes
fast → checks each element

If nums[fast] is non-zero:
    → swap
    → move slow

If nums[fast] is zero:
    → do nothing
    → fast continues
 */