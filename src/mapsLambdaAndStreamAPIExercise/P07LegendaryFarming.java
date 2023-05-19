package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> specialItems = new LinkedHashMap<>();
        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        specialItems.put("motes", 0);
        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine().toLowerCase();
            String[] data = input.split(" ");


            for (int i = 0; i <= data.length - 1; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1];

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = specialItems.get(material);
                    specialItems.put(material, currentQuantity + quantity);
                } else {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantity);
                    } else {
                        int current = junkItems.get(material);
                        junkItems.put(material, current + quantity);
                    }
                }
                if (specialItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    specialItems.put("shards", specialItems.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (specialItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    specialItems.put("fragments", specialItems.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (specialItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    specialItems.put("motes", specialItems.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }


        }
        specialItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
