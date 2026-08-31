package dsa.TwoPointers;

import java.util.Scanner;

public class Swap {

    public static void swap(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while (left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        System.out.println("\nAter Swap:");

        for(int num: nums){
            System.out.print(num+" ");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
       for(int i=0; i<arr.length; i++){
           System.out.println("Enter Number:"+ i+1 + ": ");
           arr[i] = sc.nextInt();
       }
        System.out.println("Original Array: ");
       for(int num: arr){
           System.out.print(num + " ");
       }


        swap(arr);

    }
}
