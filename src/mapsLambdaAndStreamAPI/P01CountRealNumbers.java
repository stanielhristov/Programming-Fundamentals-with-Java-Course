package mapsLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        TreeMap <Integer, Integer> countMap = new TreeMap<>();

        for (int num: numbers) {
            countMap.putIfAbsent(num, 0);
            countMap.put(num,countMap.get(num) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
