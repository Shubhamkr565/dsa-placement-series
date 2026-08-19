/*
You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2].
Each integer appears exactly once except a which appears twice and b which is missing.
The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

 */


//package dsa.arrays;
//
//public class RepeatAndMissingNumber {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,2};
//        int s = arr.length;
//        int repeat = 0;
//        int missing= 0;
//
//        for(int i=1; i<=s; i++){
//            for(int j=i+1; j<s; j++){
//                if(arr[i] == arr[j]){
//                    repeat = arr[i];
//                }
//            }
//        }
//
//        for(int i=1; i<=s; i++){
//            boolean found = false;
//            for(int j=1; j<s; j++){
//                if(i == arr[j]){
//                    found = true;
//                    break;
//                }
//            }
//            if(!found){
//                missing = i;
//            }
//        }
//
//        System.out.println("Repeat Number: "+repeat);
//        System.out.println("Missing Number: "+missing);
//
//    }
//}








package dsa.arrays;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {

        int[][] grid = {
                {1, 3},
                {2, 2}
        };

        int n = grid.length;
        int total = n * n;

        int repeat = 0;
        int missing = 0;

        // 1. Find repeating number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = i; k < n; k++) {
                    for (int l = 0; l < n; l++) {

                        // Don't compare the element with itself
                        if (i == k && j == l) {
                            continue;
                        }

                        if (grid[i][j] == grid[k][l]) {
                            repeat = grid[i][j];
                        }
                    }
                }
            }
        }

        // 2. Find missing number
        for (int num = 1; num <= total; num++) {

            boolean found = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (num == grid[i][j]) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    break;
                }
            }

            if (!found) {
                missing = num;
                break;
            }
        }

        System.out.println("Repeat Number: " + repeat);
        System.out.println("Missing Number: " + missing);
    }
}