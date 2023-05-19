package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resources = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resources.containsKey(input)) {
                resources.put(input, quantity);
            } else {
                resources.put(input, resources.get(input) + quantity);
            }




            input = scanner.nextLine();
        }
        resources.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
