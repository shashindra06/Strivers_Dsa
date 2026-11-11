package Sliding_Window;

// Given a string s, find the length of the longest substring without duplicate characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int left = 0;
//         int maxlen = 0;
//         Map<Character, Integer> seen = new HashMap<>();
//         for(int right = 0; right < s.length(); right++) {
//             char c = s.charAt(right);
//             if(seen.containsKey(c) && seen.get(c) >= left) {
//                 left = seen.get(c) + 1;
//             }
//             seen.put(c, right);
//             maxlen = Math.max(maxlen, right - left + 1);
//         }
//         return maxlen;
//     }
// }

class Long_sub_withoutrepe {
    public int lengthOfLongestSubstring(String s) {
        int[] alp = new int[128];
        int left = 0;
        int maxlen = 0;
        for (int right = 0; right < s.length(); right++) {
            int curind = s.charAt(right);
            while (alp[curind] == 1) {
                int lefind = s.charAt(left);
                alp[lefind] = 0;
                left++;
            }
            alp[curind] = 1;
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}
