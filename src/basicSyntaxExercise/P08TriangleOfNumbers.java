package basicSyntaxExercise;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}