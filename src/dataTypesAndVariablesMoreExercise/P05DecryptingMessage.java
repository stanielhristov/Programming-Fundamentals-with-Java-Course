package dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rows; i++) {
            int decryptedSymbol = 0;
            int symbolInput = scanner.nextLine().charAt(0);

            decryptedSymbol = symbolInput + key;
            System.out.printf("%c", (char) decryptedSymbol);

        }
    }
}