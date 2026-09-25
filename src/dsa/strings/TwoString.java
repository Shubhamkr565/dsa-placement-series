package dsa.strings;

public class TwoString {

    public static String findCommon(String[] strs) {

        // First string is used as reference
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            char current = first.charAt(i);

            // Compare with every other string
            for (int j = 1; j < strs.length; j++) {

                // If string ends OR character is different
                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {

        String[] s = {"abcd", "abef"};

        String result = findCommon(s);

        System.out.println("Result: " + result);
    }
}