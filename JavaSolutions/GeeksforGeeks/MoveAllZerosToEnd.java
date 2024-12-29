
/**
 * Problem Description:
 * You are given an array `arr[]` of non-negative integers.
 * The task is to move all zeros in the array to the right end
 * while maintaining the relative order of the non-zero elements.
 * This operation must be performed in place, without using extra space.
 */

class Solution {
    void pushZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // Pointer to track the position of the next non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap the current element with the element at nonZeroIndex
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;

                nonZeroIndex++; // Move the pointer forward
            }
        }
    }
}
