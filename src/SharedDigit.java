public class SharedDigit {

//    Shared Digit

//    Write a method named hasSharedDigit with two parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 99 (inclusive).
//    If one of the numbers is not within the range, the method should return false.
//    The method should return true if there is a digit that appears in both numbers,
//    such as 2 in 12 and 23; otherwise, the method should return false.

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 35));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
            int num1first = num1 / 10;
            int num1last = num1 % 10;
            int num2first = num2 / 10;
            int num2last = num2 % 10;
            return (num1first == num2first || num1last == num2last || num1first == num2last || num1last == num2first);
        }
        return false;
    }
}
