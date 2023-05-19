package basicSyntaxExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double coinsSum = 0;

        while (!input.equals("Start")) {

            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                coinsSum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();

        }

         input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                if (coinsSum >= 2.0) {
                    System.out.println("Purchased " + input);
                    coinsSum -= 2.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
                break;
                case "Water":
                    if (coinsSum >= 0.7) {
                        System.out.println("Purchased " + input);
                        coinsSum -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (coinsSum >= 1.5) {
                        System.out.println("Purchased " + input);
                        coinsSum -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (coinsSum >= 0.8) {
                        System.out.println("Purchased " + input);
                        coinsSum -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (coinsSum >= 1) {
                        System.out.println("Purchased " + input);
                        coinsSum -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            input = scanner.nextLine();

        }

        System.out.printf("Change: %.2f", coinsSum);
        
    }
}
