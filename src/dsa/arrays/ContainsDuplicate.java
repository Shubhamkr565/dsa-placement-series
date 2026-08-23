package dsa.arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int s = arr.length;
        boolean isDuplicate = false;
        for(int i=0; i<s; i++){
            for(int j=i+1; j<s; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                break;
            }
        }

        System.out.println(isDuplicate);
    }
}
