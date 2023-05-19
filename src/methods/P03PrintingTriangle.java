package methods;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        printTriangle(numberInput);

    }
    public static void printTriangle (int number) {
        for (int i = 1; i <=number ; i++) {
            printUpLine(1,i);
        }

        for (int i = number - 1; i >= 1 ; i--) {
            printUpLine(1,i);

        }
    }
    public static void printUpLine(int start, int end) {
        for (int i = start; i <=end ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
}
