package methods;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(numberInput));

    }
    public static int getMultipleOfEvensAndOdds (int number) {
        int evenSum = 0;
        int oodSum = 0;
        String realNumber = String.valueOf(number);


        for (int i = 1; i <=realNumber.length(); i++) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                evenSum = evenSum + lastDigit;
            } else if (lastDigit == 0) {
                evenSum = evenSum+ lastDigit;
            } else {
                oodSum = oodSum + lastDigit;
            }
            number = number / 10;
        }

        return evenSum * oodSum;
    }
}
