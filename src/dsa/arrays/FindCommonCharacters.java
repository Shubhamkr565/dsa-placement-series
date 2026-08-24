package dsa.arrays;

public class FindCommonCharacters {
    public static void main(String[] args) {

        // Two strings stored in an array
        String[] arr = {"abc", "cda"};

        System.out.println("Finding common characters between: "
                + arr[0] + " and " + arr[1]);

        System.out.println("Common characters:");

        // Loop through characters of the first string
        for (int i = 0; i < arr[0].length(); i++) {

            // Compare each character with every character of the second string
            for (int j = 0; j < arr[1].length(); j++) {

                // Check if both characters are the same
                if (arr[0].charAt(i) == arr[1].charAt(j)) {

                    // Print the common character
                    System.out.println(arr[0].charAt(i));
                }
            }
        }
    }
}