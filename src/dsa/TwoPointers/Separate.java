//Separate 0s and 1s

package dsa.TwoPointers;

public class Separate {

    public static void sepaeates(int[] nums){

        int left = 0;
        int right = nums.length-1;

        while (left<right){
            if(nums[left] == 1 && nums[right] == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }else if(nums[left] == 0 && nums[right] == 0){
                left++;
            }else{
                right--;
            }
        }

        for(int x : nums){
            System.out.print(x+" ");
        }

    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,0,1};

        sepaeates(arr);
    }


}
