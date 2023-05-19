package methodsExercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        System.out.print(getSymbolInRange(firstSymbol, secondSymbol));
    }

    private static String getSymbolInRange(char start, char end) {

        String result = "";
        int firstSymbol = 0;
        int secondSymbol = 0;
        if (start >= end) {
            firstSymbol = end;
            secondSymbol = start;
        } else {
            firstSymbol = start;
            secondSymbol = end;
        }

        for (int i = firstSymbol + 1; i < secondSymbol; i++) {
            result += (char) i + " ";
        }

        return result;
    }
}