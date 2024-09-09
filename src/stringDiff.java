public class stringDiff {
    public static void main(String[] args) {
        String s1 = "tiger";
        String s2 = "ti";
        String s3 = "";

        // Iterate through s1 and check manually if the character exists in s2
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean found = false;

            // Check if the character c exists in s2
            for (int j = 0; j < s2.length(); j++) {
                if (c == s2.charAt(j)) {
                    found = true;
                    break;
                }
            }

            // If the character is not found in s2, add it to s3
            if (!found) {
                s3 += c;
            }
        }

        // Print the result
        System.out.println("s3: " + s3);
    }
}
