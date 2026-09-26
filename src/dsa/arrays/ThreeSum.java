package dsa.arrays;

public class ThreeSum {

    public static void main(String[] args) {
        int[]  arr = {-1,0,1,2-1,4};

        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                for(int z=2; z<arr.length; z++){

                    if(arr[i]+arr[j]+arr[z]== 0){
                        System.out.print(arr[i]+","+arr[j]+","+arr[z]+",");
                    }
                }
            }
        }
        for(int n: arr){
            System.out.print(n+",");
        }

    }
}
