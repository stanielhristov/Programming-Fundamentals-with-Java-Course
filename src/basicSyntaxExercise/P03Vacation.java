package basicSyntaxExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String typeVacation = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.00;

        if (typeVacation.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
        } else if (typeVacation.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16.00;
            }
        } else if (typeVacation.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15.00;
            } else if (day.equals("Saturday")) {
                price = 20.00;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }

        double totalPrice = count * price;

        if (count >= 30 && typeVacation.equals("Students")) {
            totalPrice = totalPrice - totalPrice * 0.15;
        } else if (count >= 100 && typeVacation.equals("Business")) {
            totalPrice = (count - 10) * price;
        } else if (count >= 10 && count <= 20 && typeVacation.equals("Regular")) {
            totalPrice = totalPrice * 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
        
    }
}
