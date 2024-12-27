import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); // To store characters in the current substring
        int start = 0; // Beginning of the current substring
        int maxLength = 0; // Maximum length of substring found so far

        // Iterate through each character in the string
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If current character is a duplicate, shrink the window
            while (set.contains(currentChar)) {
                set.remove(s.charAt(start)); // Remove the character at the start of the window
                start++; // Move the start of the window forward
            }

            // Add the current character to the set and update maxLength
            set.add(currentChar);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength; // Return the maximum length found
    }
}
