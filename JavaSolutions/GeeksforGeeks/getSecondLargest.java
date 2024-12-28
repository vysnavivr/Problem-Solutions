class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Return -1 to indicate no valid second largest
        }

        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max_1) {
                max_2 = max_1; // Update second largest
                max_1 = num;   // Update largest
            } else if (num > max_2 && num < max_1) {
                max_2 = num; // Update second largest only
            }
        }

        // If no valid second largest is found, return -1
        return (max_2 == Integer.MIN_VALUE) ? -1 : max_2;
    }
}
