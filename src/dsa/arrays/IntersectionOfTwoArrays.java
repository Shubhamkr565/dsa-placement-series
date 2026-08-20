package dsa.arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        // Correctly allocated array size using 'new'
        int[] nums3 = new int[nums1.length];
        int x = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                // If a matching element is found between both arrays
                if (nums1[i] == nums2[j]) {

                    // Reset the flag for this specific matching number
                    boolean isPresent = false;

                    // Scan nums3 to see if we already saved this number before
                    for (int q = 0; q < x; q++) { // Only scan up to 'x' (elements added so far)
                        if (nums3[q] == nums1[i]) {
                            isPresent = true;
                            break; // Stop scanning early if found
                        }
                    }

                    // Only add the number if it was NOT found in nums3
                    if (!isPresent) {
                        nums3[x] = nums1[i];
                        x++;
                    }
                }
            }
        }

        // Print only the valid elements added, avoiding extra trailing zeros
        System.out.print("Intersection: ");
        for (int i = 0; i < x; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println();
    }
}
