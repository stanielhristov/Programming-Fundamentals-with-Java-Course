package methods;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();

        switch (typeInput) {
            case "int" -> {
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
            }
            case "char" -> {
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol, secondSymbol));
            }
            case "string" -> {
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(firstText, secondText));
            }
        }
    }
    public static int getMax(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return  secondNumber;
        }
    }
    public static char getMax (char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            return firstSymbol;
        } else {
            return  secondSymbol;
        }
    }
    public static String getMax (String firstText , String secondText) {
        if (firstText.compareTo(secondText) > 0) {
            return  firstText;
        } else {
            return secondText;
        }
    }
}
