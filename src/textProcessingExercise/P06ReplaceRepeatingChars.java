package textProcessingExercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        for (int i = 0; i <stringBuilder.length() - 1 ; i++) {
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                stringBuilder.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(stringBuilder);
    }
}
