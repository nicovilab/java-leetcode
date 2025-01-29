package palindromeNumber;

/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */


public class PalindromeNumber {

    /*
    Not optimal solution at all:

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String original = String.valueOf(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
     */

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int inputNumber = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10); // First iteration reverse (121 case)-> 0*10 + 121%10 = (0+1), Second iteration -> 1*10+12%10 = 10+2 = 12
            // Third iteration -> 12*10+1%10 = 120+1 = 121
            x /= 10;
        }
        return reverse == inputNumber;
    }


    public static void main(String[] args) {

        PalindromeNumber isPalindrome = new PalindromeNumber();

        System.out.println(isPalindrome.isPalindrome(121));
        System.out.println(isPalindrome.isPalindrome(-123));
        System.out.println(isPalindrome.isPalindrome(10));

    }
}
