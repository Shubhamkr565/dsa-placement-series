package dsa.arrays;

public class ContainerWithMostWater {

    public static int findMostWater(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int mostWater = 0;
        int currentWater = 0;

        while(left<right){
            // Distance between the two lines = width of the container
            int width = right-left;

            // The shorter line determines the water level
            if(nums[left]<nums[right]){
                currentWater = nums[left]*width;
                left++;
            }else{
                currentWater = nums[right]*width;
                right--;
            }

            // Keep the maximum water found so far
            mostWater = Math.max(mostWater, currentWater);
        }
        return mostWater;

    }


    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = findMostWater(height);

        System.out.println("Most Water: "+result);
    }
}
