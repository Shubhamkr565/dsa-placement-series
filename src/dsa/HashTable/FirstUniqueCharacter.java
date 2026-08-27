package dsa.HashTable;
import java.util.HashMap;

public class FirstUniqueCharacter {

    public static void findUniqChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }


    }

    public static void main(String[] args) {
        String s = "leetcode";

        findUniqChar(s);
    }
}
