package textProcessingExercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String firstString  = input.split(" ")[0];
        String secondString = input.split(" ")[1];

        String multiply = "";

        if (firstString.length() > secondString.length()) {
            multiply = firstString.substring(0, secondString.length());
        } else {
            multiply = secondString.substring(0,firstString.length());
        }
        int totalSum = 0;

        for (int i = 0; i < multiply.length() ; i++) {
            totalSum += (int) firstString.charAt(i) * (int) secondString.charAt(i);
        }

        if (firstString.length() > secondString.length()) {
            for (int i = multiply.length(); i < firstString.length() ; i++) {
                totalSum += (int) firstString.charAt(i);
            }
        } else {
            for (int i = multiply.length(); i < secondString.length(); i++) {
                totalSum += (int) secondString.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
