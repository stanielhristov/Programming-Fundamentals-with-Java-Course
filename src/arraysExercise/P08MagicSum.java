package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <=numbers.length - 1 ; index++) {
            int currentNumber = numbers [index];

            for (int i = index + 1; i <= numbers.length - 1 ; i++) {
                int inNumber = numbers [i];

                if (currentNumber + inNumber == magicNumber) {
                    System.out.println(currentNumber + " " + inNumber);
                }
            }

        }

    }
}
