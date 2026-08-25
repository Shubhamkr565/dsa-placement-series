//Problem: Given an array, return true if any value appears at least twice, otherwise false.

package dsa.HashTable;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,3,4};

        System.out.println(containDuplicate(arr1));
        System.out.println(containDuplicate(arr2));

    }
}
