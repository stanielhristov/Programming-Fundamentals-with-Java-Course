package regularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] demons = scanner.nextLine().split("[, ]+");
        List<String> demonsBook = new ArrayList<>();
        for (int j = 0; j < demons.length; j++) {
            String demon = demons[j];
            StringBuilder status = new StringBuilder();
            int health = getHealth(demon);
            double damage = getDamage(demon);

            for (int i = 0; i < demon.length(); i++) {
                char operator = demon.charAt(i);
                if (operator == '*') {
                    damage *= 2;
                } else if (operator == '/') {
                    damage /= 2;
                }
            }

            status.append(demon + " - " + health + " health, " + String.format("%.2f", damage) + " damage");
            demonsBook.add(status.toString());
        }

        demonsBook.forEach(d -> System.out.println(d));
    }

    private static double getDamage(String demon) {
        String regex = "\\-?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);
        double damage = 0;
        while (matcher.find()) {
            double digit = Double.parseDouble(matcher.group());
            damage += digit;
        }
        return damage;

    }

    private static int getHealth(String demon) {

        String regex = "[^\\d+\\+\\-*\\/\\.]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);
        int health = 0;
        while (matcher.find()) {
            health += IntStream.range(0, matcher.group().length()).map(i -> matcher.group().charAt(i)).sum();
        }
        return health;
    }
}