package dsa.SlidingWindow;
import java.util.ArrayList;
public class WindowMaximum {

    public static ArrayList<Integer> findMaxWindow(int[] nums, int k){
        ArrayList<Integer> windowMax = new ArrayList<>();

        for(int left = 0; left<=nums.length-k; left++){
            int temp = nums[left];

//            Check all element inside the current window
            for(int right=left+1; right<left+k; right++){
                if(nums[right]>temp){
                    temp = nums[right];
                }
            }
            windowMax.add(temp);
        }
        return windowMax;
    }



    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        ArrayList<Integer> result = findMaxWindow(arr, k);
//        int result = findMaxWindow(arr, k);
        System.out.print("MaxWindow: "+result);
    }
}
