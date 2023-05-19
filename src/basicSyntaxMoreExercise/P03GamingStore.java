package basicSyntaxMoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double totalMoney = balance;
        double totalSpent = 0;
        String game = scanner.nextLine();

        while (!game.equals("Game Time")) {
            String currentGame = game;

            switch (currentGame) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    game = scanner.nextLine();
                    continue;

            }
            if (balance != 0) {
                if (balance < price) {
                    System.out.println("Too Expensive");
                } else {
                    totalSpent += price;
                    balance -= price;
                    System.out.printf("Bought %s%n", currentGame);
                }
            }
            if (balance == 0) {
                System.out.println("Out of money!");
                break;


            }
            game = scanner.nextLine();

        }
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, (totalMoney - totalSpent));
    }
}
