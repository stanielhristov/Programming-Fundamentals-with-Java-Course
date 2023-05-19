package textProcessing;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String string = scanner.nextLine();

        int index = string.indexOf(toRemove);

        while(index != -1) {
            string = string.replace(toRemove, "");
            index = string.indexOf(toRemove);
        }
        System.out.println(string);

    }
}
