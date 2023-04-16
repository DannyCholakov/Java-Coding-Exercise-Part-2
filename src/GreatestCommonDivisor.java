public class GreatestCommonDivisor {

//    Greatest Common Divisor

//    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//    If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//    The method should return the greatest common divisor of the two numbers (int).
//    The greatest common divisor is the largest positive integer that can
//    fully divide each of the integers (i.e. without leaving a remainder).

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }
}