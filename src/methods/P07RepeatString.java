package methods;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int repeatInput = Integer.parseInt(scanner.nextLine());

        String resultText = repeatString(repeatInput, commandInput);
        System.out.println(resultText);

    }
    public static String repeatString (int repeat, String command) {
        String result = "";
        for (int i = 0; i <repeat ; i++) {
         result = result + command;
        }
        return  result;
    }
}
