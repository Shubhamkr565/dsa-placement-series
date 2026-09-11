/*
nums = [3, 1, 2, 1, 1, 5]
K = 5

Find:

Longest valid subarray
Its length
At which point the window becomes invalid
What element(s) you remove from the left
 */

package dsa.SlidingWindow;

public class MiniChallenge {

    public static void challengeAccept(int[] nums, int k) {

        int left = 0;
        int windowSum = 0;

        int maxLength = 0;
        int maxStart = 0;
        int maxEnd = 0;

        for (int right = 0; right < nums.length; right++) {

            // 1. Add new element
            windowSum += nums[right];

            // 2. Window becomes invalid
            if (windowSum > k) {

                System.out.println(
                        "\nWindow became INVALID at right = " + right +
                                " (value = " + nums[right] + ")" +
                                ", sum = " + windowSum
                );
            }

            // 3. Shrink until valid
            while (windowSum > k) {

                System.out.println(
                        "Removing " + nums[left] +
                                " from left (index = " + left + ")"
                );

                windowSum -= nums[left];
                left++;
            }

            // 4. Current window is valid
            int currentLength = right - left + 1;

            System.out.println(
                    "Valid window = [" + left + ", " + right + "]" +
                            ", sum = " + windowSum +
                            ", length = " + currentLength
            );

            // 5. Update maximum
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStart = left;
                maxEnd = right;
            }
        }

        System.out.println("\n========== ANSWER ==========");
        System.out.println("Max Length: " + maxLength);

        System.out.print("Longest valid subarray: [");

        for (int i = maxStart; i <= maxEnd; i++) {
            System.out.print(nums[i]);

            if (i < maxEnd) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 1, 1, 5};
        int k = 5;

        challengeAccept(arr, k);
    }
}