public class LastDigitChecker {

//    Last Digit Checker

//    Write a method named hasSameLastDigit with three parameters of type int.
//    Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
//    If one of the numbers is not within the range, the method should return false.
//    The method should return true if at least two of the numbers share the same rightmost digit;
//    otherwise, it should return false.

    public static void main(String[] args) {
     System.out.println(hasSameLastDigit(13,44,74));
    }
    public static boolean isValid(int num){
        return (num >= 10) && (num <= 1000);
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }
        return false;
    }
}
