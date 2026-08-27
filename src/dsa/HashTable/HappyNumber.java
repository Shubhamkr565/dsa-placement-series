/*
Given a positive integer n, determine if it is a happy number.
A number is happy if, when you repeatedly replace it with the sum of the squares of its digits, you eventually reach 1.
If it enters a cycle that never reaches 1, it's not happy.
 */

package dsa.HashTable;

import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();

        while (n != 1){
            if(set.contains(n)){
                return  false;
            }
            set.add((n));
             n = sumOfSquareDigits(n);
        }
        return  true;
    }

    public static int sumOfSquareDigits(int n){
        int sum = 0;

        while (n>0){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return  sum;
    }


    public static void main(String[] args) {

        System.out.println(isHappy(19));
        System.out.println(isHappy(2));

    }


}
