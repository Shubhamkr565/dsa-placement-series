package dsa.HashTable;

import java.util.HashMap;

public class SubarraySum {

    public static int findSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int target = 3;

        System.out.println(findSubarraySum(arr, target));
    }
}