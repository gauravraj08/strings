public class kSubString {
    // Helper function to count substrings with at most K distinct characters
    public static int countAtMostKDistinct(String s, int k) {
        int n = s.length();
        int count = 0;
        int[] freq = new int[26];  // Frequency array for lowercase letters
        int distinctCount = 0;     // To track the number of distinct characters
        int left = 0;

        for (int right = 0; right < n; right++) {
            // Get the index of the current character
            int currentCharIndex = s.charAt(right) - 'a';

            // If this character is appearing for the first time in the window
            if (freq[currentCharIndex] == 0) {
                distinctCount++;
            }
            // Increment the frequency of the current character
            freq[currentCharIndex]++;

            // If the distinct count exceeds k, shrink the window from the left
            while (distinctCount > k) {
                int leftCharIndex = s.charAt(left) - 'a';
                freq[leftCharIndex]--;  // Reduce the frequency of the character at the left
                if (freq[leftCharIndex] == 0) {
                    distinctCount--;   // Decrease distinct count if the character count becomes 0
                }
                left++;  // Move the left pointer to shrink the window
            }

            // Add all valid substrings ending at 'right'
            count += right - left + 1;
        }

        return count;
    }

    // Function to count substrings with exactly K distinct characters
    public static int countExactKDistinct(String s, int k) {
        // Count substrings with at most K distinct characters
        int atMostK = countAtMostKDistinct(s, k);
        // Count substrings with at most (K-1) distinct characters
        int atMostKMinusOne = countAtMostKDistinct(s, k - 1);

        // Substrings with exactly K distinct characters
        return atMostK - atMostKMinusOne;
    }

    public static void main(String[] args) {
        String s = "abcba";  // Example string
        int k = 2;           // Example value for k

        int result = countExactKDistinct(s, k);
        System.out.println("Number of substrings with exactly " + k + " distinct characters: " + result);
    }
}
