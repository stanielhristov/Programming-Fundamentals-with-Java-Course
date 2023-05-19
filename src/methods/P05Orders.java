package methods;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (commandInput) {
            case "coffee":
                ordersTotalSum(quantity, 1.50);
                break;
            case "water":
                ordersTotalSum(quantity, 1.00);
                break;
            case "coke":
                ordersTotalSum(quantity, 1.40);
                break;
            case "snacks":
                ordersTotalSum(quantity, 2.00);
                break;
        }


    }
    public static void ordersTotalSum (int quantity, double price) {
        double totalSum = quantity * price;
        System.out.printf("%.2f", totalSum);
    }
}
