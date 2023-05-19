package methodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        printVowelsCount(input);
    }

    private static void printVowelsCount(String text) {
        int counter = 0;
        for (char element : text.toCharArray()) {
            switch (element) {
                case 'a', 'o', 'e', 'i', 'u' -> counter++;
            }
        }
        System.out.println(counter);
    }
}