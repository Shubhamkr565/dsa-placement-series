package dsa.HashTable;

import java.util.HashMap;

public class TwoSum2 {

    public static int[] FindTwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        int[] arr = {10,20,50,40,30};
        int target = 90;

        int result[] = FindTwoSum(arr, target);
        System.out.println(result[0] + ", "+ result[1]);
    }
}
