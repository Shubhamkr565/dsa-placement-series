package dsa.arrays;

public class MajorityElement2 {

    public static void MajorityElement(int[] arr){
        int s = arr.length;
        int count = 0;
        int maxMajority = 0;

        for(int num: arr){
            if(count == 0){
                maxMajority = num;
            }
            if(num == maxMajority){
                count++;
            }else {
                count--;
            }
        }
        System.out.println("Majority Element: "+maxMajority);
    }


    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        MajorityElement(arr);
    }
}
