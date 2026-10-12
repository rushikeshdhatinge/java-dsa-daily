/**
 * Problem   : Valid Palindrome (example)
 * Source    : LeetCode 125
 * Topic     : strings
 * Difficulty: Easy
 *
 * Approach  : Two pointers, skipping non-alphanumeric characters.
 * Time      : O(n)
 * Space     : O(1)
 */
public class Solution {

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car"));                     // false
    }
}
