package methodsExercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=number ; i++) {
            if (isSumDivisibleBy8(i) && isContainsOddDigit(i)) {
                System.out.println(i);
            }
        }

    }
    public static boolean isSumDivisibleBy8 (int number) {
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits = sumDigits + lastDigit;
            number = number / 10;
        }
        return sumDigits % 8 == 0;
    }

    public static boolean isContainsOddDigit (int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 !=0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
