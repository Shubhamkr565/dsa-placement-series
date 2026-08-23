package dsa.arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {2,5,8,1,9};
        int s = arr.length;

        int max = arr[0];

        for(int i=1; i<s; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximun Element present in the Array: "+max+" ");
    }
}
