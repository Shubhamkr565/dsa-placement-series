/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */

package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MergeSortedArray {

    public static void merge(int[] num1, int[] num2){
        ArrayList<Integer> list = new ArrayList<>();
//        Add first array
        for(int num: num1){
            list.add(num);
        }

//        Add second array
        for(int num: num2){
            list.add(num);
        }

//      sort array
        Collections.sort(list);

//        print list
        for(int num: list){
            System.out.print(num+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {15,25,35};

        merge(arr1,arr2);
    }
}