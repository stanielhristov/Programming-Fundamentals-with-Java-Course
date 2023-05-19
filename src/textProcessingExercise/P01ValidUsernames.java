package textProcessingExercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputData = input.split(", ");


        for (int i = 0; i <= inputData.length - 1 ; i++) {
            int count = 0;
            if (inputData[i].length() >= 3 && inputData[i].length() <= 16) {
                for (char symbol : inputData[i].toCharArray()) {
                    if (Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_') {
                        count++;
                    }
                }
            }
            if (count == inputData[i].length()) {
                System.out.println(inputData[i]);
            }
        }
    }
}
