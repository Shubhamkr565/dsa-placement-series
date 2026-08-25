/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */

package dsa.HashTable;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcab";


        if(s.length() != t.length()){
            System.out.println(false);
            return;
        }

        int[] freq= new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}