package dsa.BinarySearch;

public class AllocateMinimumPages {

    public static int findMinimumPage(int[] nums, int student){
        int size = nums.length-1;

        if(size < student){
            return -1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        int student  =2;

        int result = findMinimumPage(arr, student);

        System.out.println("Result: "+ result);
    }
}
