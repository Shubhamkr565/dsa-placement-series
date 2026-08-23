package dsa.arrays;
import java.util.HashSet;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        int[] arr ={1,2,3,1};
        HashSet<Integer> set = new HashSet<>();

        for(int num: arr){
            if(set.contains(num)){
                System.out.println(true);
                return;
            }
            set.add(num);
        }
        System.out.println(false);
    }
}
