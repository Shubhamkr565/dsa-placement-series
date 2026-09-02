package dsa.TwoPointers;

public class ReverseAnArray {

    public static void Reverse(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        for(int x: nums){
            System.out.print(x+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        Reverse(arr);
    }
}
