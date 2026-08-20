package dsa.arrays;

public class MergeSortedArray2 {

    public static void merge(int[] num1, int[] num2) {
        int n = num1.length;
        int m = num2.length;

        int[] num3 = new int[n+m];
        int i=0;
        int j = 0;
        int k =0;
        while (i<n && j<m){
            if(num1[i] < num2[j]){
                num3[k] = num1[i];
                i++;
            }else{
                num3[k] = num2[j];
                j++;
            }
            k++;
        }
//        Adding remaing element of num1
        while (i<n){
            num3[k] = num1[i];
            i++;
            k++;
        }
        while (j<m){
            num3[k] = num2[j];
            j++;
            k++;
        }
//        print merge arr
        for(int num: num3){
            System.out.println(num+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {15,25,35};

        merge(arr1, arr2);
    }
}
