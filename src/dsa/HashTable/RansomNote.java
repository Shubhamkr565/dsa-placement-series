/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using
the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

package dsa.HashTable;
import java.util.HashMap;

public class RansomNote {
    public static boolean checkRansom(String r, String m){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<m.length(); i++){
            char ch = m.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<r.length(); i++){
            char ch = r.charAt(i);

            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch) -1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransom = "aa";
        String magazine = "aab";

        boolean result = checkRansom(ransom, magazine);
        System.out.println(result);
    }
}
