public class NumberToWords {
//    Number To Words

//    Write a method called numberToWords with one int parameter named number.
//    The method should print out the passed number using words for the digits.
//    If the number is negative, print "Invalid Value".
//    To print the number as words, follow these steps:

//    Extract the last digit of the given number using the remainder operator.
//    Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
//    Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//    Remove the last digit from the number.
//    Repeat Steps 2 through 4 until the number is 0.

//    The logic above is correct, but in its current state, the words will be printed in reverse order.
//    For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four".
//    To overcome this problem, write a second method called reverse.
//    The method reverse should have one int parameter and return the reversed number (int).
//    For example, if the number passed is 234, then the reversed number would be 432.
//    The method  reverse should also reverse negative numbers.
//    Use the method reverse within the method numberToWords in order to print the words in the correct order.
//    Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001).
//    The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero".

//    To solve this problem, write a third method called getDigitCount.
//    The method getDigitCount should have one int parameter called number and return the count of the digits in that number.
//    If the number is negative, return -1 to indicate an invalid value.
//    For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

    public static void main(String[] args) {
        numberToWords(1234);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {

            switch (reverseNumber % 10) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
                default -> {
                }
            }
            reverseNumber /= 10;
        }

        System.out.println();
    }


    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
