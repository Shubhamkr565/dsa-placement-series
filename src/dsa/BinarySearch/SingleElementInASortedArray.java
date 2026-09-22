package dsa.BinarySearch;

public class SingleElementInASortedArray {

    public static int findSingleElement(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while (left<right){
            int mid = left+(right-left)/2;

            if(mid%2==1){
                System.out.println("Mid value: "+mid);
                mid--;
                System.out.println("Mid-- value: "+mid);
            }

            if(nums[mid] == nums[mid+1]){
                System.out.println("nums[mid]: "+nums[mid] + " num[mid+1]: "+nums[mid+1]);
                left = mid+2;
                System.out.println("Mid+2: "+left);
            }else{
                right = mid;
                System.out.println("Right = mid: "+right);
            }
        }
        return nums[right];
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};

        int result = findSingleElement(arr);

        if(result != -1){
            System.out.println("Single Element in Sorted Array: "+result);
        }else{
            System.out.println("No Single Element............");
        }

    }
}
