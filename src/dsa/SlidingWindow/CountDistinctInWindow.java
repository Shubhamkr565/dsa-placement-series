
package dsa.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDistinctInWindow {

    public static List<Integer> countDistinct(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();

        int left = 0;

        // Stores element -> frequency in current window
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {

            // Add the new element to the window
            frequency.put(
                    nums[right],
                    frequency.getOrDefault(nums[right], 0) + 1
            );

            // Process when window size becomes k
            if (right - left + 1 == k) {

                // Number of distinct elements
                result.add(frequency.size());

                // Remove the leftmost element
                int leftElement = nums[left];

                frequency.put(
                        leftElement,
                        frequency.get(leftElement) - 1
                );

                // Remove from map if frequency becomes zero
                if (frequency.get(leftElement) == 0) {
                    frequency.remove(leftElement);
                }

                // Move the left pointer
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        List<Integer> result = countDistinct(nums, k);

        System.out.println(
                "Distinct elements in every window: " + result
        );
    }
}
