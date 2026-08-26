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
import java.util.HashMap;

public class ValidAnagram2 {

    public static boolean CheckAnagram2(String s, String g){

        if(s.length() != g.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int j=0; j<g.length(); j++){
            char ch = g.charAt(j);

            if(!map.containsKey(ch)){
                return false;
            }

            map.put(ch, map.get(ch)-1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }



    public static void main(String[] args) {
        String s = "shubham";
        String g = "mahbuhs";

        boolean result = CheckAnagram2(s,g);
        System.out.println(result);
    }
}