package dsa.arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.println("Duplicate no: "+ nums[i]);
                    break;
                }
            }
        }

        for(int number = 1; number <nums.length; number++){
            boolean isFound = false;

            for(int i=0; i<nums.length; i++){
                if(nums[i] == number){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                System.out.println("Missing No: "+ number);
            }
        }



    }
}
