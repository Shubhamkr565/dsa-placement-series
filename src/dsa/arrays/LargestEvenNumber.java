package dsa.arrays;

import java.util.Scanner;

public class LargestEvenNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Taking 5 numbers from user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int LE = Integer.MIN_VALUE;
        boolean found = false;

        // Finding largest even number
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                found = true;
                if (arr[i] > LE) {
                    LE = arr[i];
                }
            }
        }

        if(found){
            System.out.println("Largest No: "+ LE);
        }else{
            System.out.println("No Even number found....");
        }



        sc.close();
    }
}