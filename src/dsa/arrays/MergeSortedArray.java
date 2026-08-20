/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */

package dsa.arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void MergeTwoArr(int[] num1, int[] num2){
        int n1 = num1.length;
        int n2 = num2.length;

        int[] num3 = new int[n1+n2];

        int i = 0; // num1 ke liya pointer
        int j = 0; // num2 ke liya pointer
        int k = 0; // num3 ke liya pointer


//        find smallest elements
        while (i<n1 && j<n2){
            if(num1[i] <= num2[j]){
                num3[k++] = num1[i++];
            }else{
                num3[k++] = num2[j++];
            }
        }

//        Agar num1 mein elements bache hon to
        while (i<n1){
            num3[k++] = num1[i++];
        }


//        Agar num2 mein elements bache hon to
        while (j<n2){
            num3[k++] = num2[j++];
        }

        System.out.println("Merage sorted arrays: "+ Arrays.toString(num3));

        }

    public static void main(String[] args) {
        int[] num1 = {1,2,5};
        int[] num2 = {4,6,8};

        MergeTwoArr(num1, num2);
    }
}
