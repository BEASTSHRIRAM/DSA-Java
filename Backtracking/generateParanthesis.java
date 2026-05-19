package Backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> set = new ArrayList<>();
        if (n == 0) {
            return set;
        }
        backtrack(set, "", 0, 0, n);
        return set;
    }

    private void backtrack(List<String> set, String current, int open, int close, int max) {
        // Base case: if the current string has reached the max length (2 * n)
        if (current.length() == max * 2) {
            set.add(current);
            return;
        }

        // Add an open parenthesis if we haven't used all of them
        if (open < max) {
            backtrack(set, current + "(", open + 1, close, max);
        }

        // Add a close parenthesis if it won't exceed the number of open ones
        if (close < open) {
            backtrack(set, current + ")", open, close + 1, max);
        }
    }

    // Main method to test and print the pattern
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12; // Change this value to test different patterns

        List<String> result = sol.generateParenthesis(n);

        System.out.println("Pattern for n = " + n + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}