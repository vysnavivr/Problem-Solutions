# Problem-Solutions
Collection of problems solved on LeetCode and GeeksforGeeks, categorized by topic.
## Weekly Progress

### Week 1: Problem Solving

#### Day 1: Longest Substring Without Repeating Characters
- **Problem**: [LeetCode Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
  
##### Solution:
This problem is solved using the sliding window technique. We maintain a window of characters, expanding it as long as characters are unique. If a duplicate is found, the window is adjusted by removing characters from the start upto the duplicate character.

##### Code:
You can view the complete Java solution [here](https://github.com/vysnavivr/Problem-Solutions/blob/main/JavaSolutions/LongestSubstring.java).

##### Time Complexity:
O(n)

##### Space Complexity:
O(min(n, m)), where `n` is the length of the string and `m` is the size of the character set.

