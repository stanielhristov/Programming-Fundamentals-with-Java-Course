package methodsExercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calculateFactorial(num1);
        long secondFactorial = calculateFactorial(num2);

        double result = firstFactorial * 1.0 / secondFactorial;

        System.out.printf("%.2f", result);

    }
    public static long calculateFactorial(int num) {
        long factSum = 1;
        for (int i = 1; i <=num ; i++) {
            factSum = factSum * i;
        }
        return factSum;
    }
}
