/**6.31 (FINANCIAL: CREDIT CARD NUMBER VALIDATION) Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with
4 for Visa cards, 5 for Master cards, 37 for American Express cards, and 6 for Discover cards
In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine whether a card number is entered correctly, or whether a credit card is scanned correctly by a scanner.
Credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626):

Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.

Then add all single-digit numbers from Step 1.

4+4+8+2+3+1+7+8=37

Add all digits in the odd places from right to left in the card number.

6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
Sum the results from Step 2 and Step 3.

37 + 38 = 75
If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.

Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid. Design your program to use the following methods:

import java.util.Scanner;

public class ProgramAssignment2_M01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = scanner.nextLong();

        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }
    }

    /** Return true if the card number is valid */

import java.util.Scanner;

public class ProgramAssignment2_M01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = scanner.nextLong();

        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        return (getSize(number) >= 13 && getSize(number) <= 16) &&
               (prefixMatched(number, 4) || prefixMatched(number, 5) || 
                prefixMatched(number, 37) || prefixMatched(number, 6)) &&
               (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        if (numStr.length() <= k) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }
}
