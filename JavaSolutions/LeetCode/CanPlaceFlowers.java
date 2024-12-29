// Class to solve the problem of placing flowers in a flowerbed
class Solution {

    /**
     * Determines if n flowers can be placed in the flowerbed without violating 
     * the rule that no two flowers can be adjacent.
     *
     * @param flowerbed - Array representing the flowerbed (1: flower, 0: empty)
     * @param n - Number of flowers to place
     * @return true if n flowers can be placed, false otherwise
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // If no flowers need to be placed, return true
        if (n == 0) {
            return true;
        }
        
        int len = flowerbed.length;

        // Iterate through the flowerbed
        for (int i = 0; i < len; ++i) {
            // Check if the current plot is empty and the adjacent plots are also empty (or boundaries)
            if (flowerbed[i] == 0 
                && (i == 0 || flowerbed[i - 1] == 0) 
                && (i == len - 1 || flowerbed[i + 1] == 0)) {
                // Place a flower in the current plot
                flowerbed[i] = 1;

                // Decrement the number of flowers to place
                if (--n == 0) {
                    return true; // Successfully placed all flowers
                }
            }
        }

        // If not all flowers could be placed, return false
        return false;
    }
}
