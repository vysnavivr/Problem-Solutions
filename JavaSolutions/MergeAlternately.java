// Class to solve the problem of merging two strings alternately
class Solution {
    
    /**
     * Merges two strings alternately.
     * If one string is longer, appends the remaining characters at the end.
     *
     * @param word1 - First input string
     * @param word2 - Second input string
     * @return Merged string
     */
    public String mergeAlternately(String word1, String word2) {
        // Calculate the maximum length between the two strings
        int len = Math.max(word1.length(), word2.length());
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder res = new StringBuilder();

        // Iterate through both strings
        for (int i = 0; i < len; i++) {
            // Add a character from word1 if within bounds
            if (i < word1.length()) {
                res.append(word1.charAt(i));
            }
            // Add a character from word2 if within bounds
            if (i < word2.length()) {
                res.append(word2.charAt(i));
            }
        }

        // Convert StringBuilder to a string and return
        return res.toString();
    }
}
