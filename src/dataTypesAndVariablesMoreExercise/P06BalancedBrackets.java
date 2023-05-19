package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String[] inputLines = IntStream.range(0, number).mapToObj(i -> scanner.nextLine()).toArray(String[]::new);
        boolean isBalanced = false;
        for (int i = 0; i < inputLines.length; i++) {
            if (inputLines[i].equals("(")) {
                isBalanced = false;
                for (int j = i + 1; j < inputLines.length; j++) {
                    if (inputLines[j].equals(")")) {
                        isBalanced = true;
                        inputLines[i] = "open";
                        inputLines[j] = "close";
                        break;
                    }
                }
            }
        }

        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");

        }
    }
}