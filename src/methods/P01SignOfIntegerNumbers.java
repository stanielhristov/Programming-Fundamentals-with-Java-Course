package methods;

import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = Integer.parseInt(scanner.nextLine());

        signOfInteger(numberInput);

    }

    public static void signOfInteger (int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
