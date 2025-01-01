# Problem-Solutions
Collection of problems solved on LeetCode and GeeksforGeeks, categorized by topic.
## Weekly Progress

### Week 1: Problem Solving

### Day 1: 
- **Problem**: Longest Substring Without Repeating Characters. [LeetCode Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
  
##### Solution:
This problem is solved using the sliding window technique. We maintain a window of characters, expanding it as long as characters are unique. If a duplicate is found, the window is adjusted by removing characters from the start upto the duplicate character.

##### Code:
You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions/LeetCode/LongestSubstring.java).

##### Time Complexity:
O(n)

##### Space Complexity:
O(min(n, m)), where `n` is the length of the string and `m` is the size of the character set.

### Day 2: 
- **Problem**: Merge Alternately. [LeetCode Link](https://leetcode.com/problems/merge-strings-alternately)

##### Solution:  
This problem is solved using a simple iteration technique. Characters from both strings are added alternately using a loop. If one string is longer, the remaining characters are appended to the result after the loop completes.

##### Code:  
You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions?LeetCode/MergeAlternately.java).

##### Time Complexity:  
O(n), where n is the length of the longer string.

##### Space Complexity:  
O(n), due to the usage of `StringBuilder` to build the result string.


---

-  **Problem**: Second largest. [GeeksforGeeks Link](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735)

##### Solution:  
This problem is solved by iterating through the array once and maintaining two variables: `max_1` (the largest element) and `max_2` (the second largest element). For each element:
  1. If it's greater than `max_1`, update `max_2` to `max_1`, and then update `max_1`.
  2. If it's between `max_1` and `max_2`, update `max_2`.

After the loop completes, if `max_2` is still `Integer.MIN_VALUE`, it means there was no second largest element.

##### Code:  
  You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions/GeeksforGeeks/getSecondLargest.java).

##### Time Complexity:  
  O(n), where n is the length of the array. We only iterate through the array once.

##### Space Complexity:  
  O(1), since we only use two variables (`max_1` and `max_2`) to track the largest and second largest values, resulting in constant space usage.

  ### Day 3:  

- **Problem**: Can Place Flowers. [LeetCode Link](https://leetcode.com/problems/can-place-flowers)  

##### Solution:  
This problem is solved by iterating through the `flowerbed` array and checking for valid empty spots where flowers can be planted without violating the adjacent-flowers rule. For each position:  
1. If the current position is `0` and both neighbors (if they exist) are also `0`, place a flower by setting it to `1`.  
2. Decrement the required number of flowers to be placed (`n`).  
3. If `n` reaches `0` during the iteration, return `true`.  

If the loop completes and `n` is still greater than `0`, return `false`.  

##### Code:  
You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions/LeetCode/CanPlaceFlowers.java).  

##### Time Complexity:  
O(n), where n is the length of the `flowerbed` array.  

##### Space Complexity:  
O(1), as the solution modifies the input array in place without using additional space.  

---  

- **Problem**: Move All Zeros to End (In-Place). [GeeksforGeeks Link](https://practice.geeksforgeeks.org/problems/move-all-zeros-to-end-in-place)  

##### Solution:  
This problem is solved using a two-pointer technique:  
1. Traverse the array with a pointer `i` to find all non-zero elements.  
2. Maintain another pointer `j` that tracks the position where the next non-zero element should be placed.  
3. For every non-zero element encountered at `i`, swap the values at `i` and `j`, then increment `j`.  

After the iteration, all non-zero elements are at the beginning of the array, and the remaining elements are zeros.  

##### Code:  
You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions/GeeksforGeeks/MoveAllZerosToEnd.java).  

##### Time Complexity:  
O(n), where n is the length of the array.  

##### Space Complexity:  
O(1), as the solution modifies the input array in place without using additional space.  

### Day 4:  

- **Problem**: GCD of Strings. [LeetCode Link](https://leetcode.com/problems/greatest-common-divisor-of-strings)  

##### Solution:  
This problem is solved recursively using the following approach:  
1. Identify the larger string and the smaller string.  
2. If the larger string does not start with the smaller string, return an empty string since no common divisor exists.  
3. If both strings are equal, the smaller string is the GCD.  
4. Otherwise, recursively calculate the GCD by removing the smaller string from the beginning of the larger string.  

##### Code:  
You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions/LeetCode/GCDOfStrings.java).  

##### Time Complexity:  
O(n), where n is the length of the larger string.  

##### Space Complexity:  
O(n), due to the recursive calls.  

---  

- **Problem**: Rotate an Array. [GeeksforGeeks Link](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621)  

##### Solution:  
This problem is solved using the reverse method:  
1. Calculate the effective number of rotations needed using `d = d % n`.  
2. Reverse the first `d` elements of the array.  
3. Reverse the remaining `n - d` elements.  
4. Reverse the entire array to achieve the final rotated result.  

This approach is efficient and operates in-place.  

##### Code:  
You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions/GeeksforGeeks/RotateArrayInPlace.java).  

##### Time Complexity:  
O(n), where n is the size of the array.  

##### Space Complexity:  
O(1), as the solution modifies the input array in place without using additional space.  



