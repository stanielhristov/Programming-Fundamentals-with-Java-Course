package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= num; i++) {
            int count = 0;
            boolean isPrime = true;
            int j = 1;
            while (j <= i) {
                if (i % j == 0) {
                    count++;
                }
                j++;
            }
            if (count > 2) {
                isPrime = false;
            }
            System.out.printf("%d -> %b%n", i, isPrime);

        }
    }
}