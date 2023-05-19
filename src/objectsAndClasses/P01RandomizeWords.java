package objectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] words = input.split("\\s+");

        Random generator = new Random();

        for (int i = 0; i < words.length ; i++) {
            int index1 = generator.nextInt(words.length);
            int index2 = generator.nextInt(words.length);

            String oldWord = words [index1];
            words [index1] = words [index2];
            words [index2] = oldWord;

        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
