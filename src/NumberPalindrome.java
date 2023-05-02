public class NumberPalindrome {

//    Number Palindrome

//    Write a method called isPalindrome with one int parameter called number.
//    The method needs to return a boolean.
//    It should return true if the number is a palindrome
//    number otherwise it should return false.


    public static void main(String[] args) {
        System.out.println(isPalindrome(1222));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;
        }

        return number == reverse;
    }
}
