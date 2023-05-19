package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());
        int firstPower = pokePower;
        int pokes = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            pokes++;

            if (pokePower == firstPower / 2){
                if (exhaustion != 0) {
                    pokePower = pokePower / exhaustion;
                }
            }
        }

        System.out.println(pokePower);
        System.out.println(pokes);

    }
}
