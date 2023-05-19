package basicSyntax;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstHour = Integer.parseInt(scanner.nextLine());
        int firstMinutes = Integer.parseInt(scanner.nextLine());

        int total = firstHour * 60 + firstMinutes + 30;
        int hour = total / 60;
        int minutes = total % 60;

        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minutes);
        
    }
}
