package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        double E = 0.000001;
        boolean isEqual = Math.abs(firstNum - secondNum) < E;

        if (!isEqual) {
            System.out.println("False");
        } else {
            System.out.println("True");

        }
    }
}