package basicSyntaxMoreExercise;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        while (lines > 0) {
            String input= scanner.nextLine();
            int keyboardNumber=Integer.parseInt(""+input.charAt(0));
            String charSet = switch (keyboardNumber) {
                case 2 -> "abc";
                case 3 -> "def";
                case 4 -> "ghi";
                case 5 -> "jkl";
                case 6 -> "mno";
                case 7 -> "pqrs";
                case 8 -> "tuv";
                case 9 -> "wxyz";
                case 0 -> " ";
                default -> "";
            };
            System.out.print(charSet.charAt(input.length()-1));

            lines--;
        }
    }
}