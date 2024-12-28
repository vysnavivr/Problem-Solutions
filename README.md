# Problem-Solutions
Collection of problems solved on LeetCode and GeeksforGeeks, categorized by topic.
## Weekly Progress

### Week 1: Problem Solving

### Day 1: 
- **Problem**:Longest Substring Without Repeating Characters. [LeetCode Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
  
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

**Solution**:  
This problem is solved using a simple iteration technique. Characters from both strings are added alternately using a loop. If one string is longer, the remaining characters are appended to the result after the loop completes.

**Code**:  
You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions?LeetCode/MergeAlternately.java).

**Time Complexity**:  
O(n), where n is the length of the longer string.

**Space Complexity**:  
O(n), due to the usage of `StringBuilder` to build the result string.

- **Problem**: Second largest. [GeeksforGeeks Link](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735)

**Solution**:  
This problem is solved by iterating through the array once and maintaining two variables: `max_1` (the largest element) and `max_2` (the second largest element). For each element:
  1. If it's greater than `max_1`, update `max_2` to `max_1`, and then update `max_1`.
  2. If it's between `max_1` and `max_2`, update `max_2`.

After the loop completes, if `max_2` is still `Integer.MIN_VALUE`, it means there was no second largest element.

**Code**:  
  You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions/GeeksforGeeks/getSecondLargest.java).

**Time Complexity**:  
  O(n), where n is the length of the array. We only iterate through the array once.

**Space Complexity**:  
  O(1), since we only use two variables (`max_1` and `max_2`) to track the largest and second largest values, resulting in constant space usage.

