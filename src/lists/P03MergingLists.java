package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> merged = new ArrayList<>();

        int shorterSize = Math.min(listOne.size(), listTwo.size());

        for (int i = 0; i < shorterSize; i++) {
            merged.add(listOne.get(i));
            merged.add(listTwo.get(i));
        }

        if (listOne.size() > listTwo.size()) {
            merged.addAll(listOne.subList(shorterSize, listOne.size()));
        } else {
            merged.addAll(listTwo.subList(shorterSize, listTwo.size()));
        }

        printOutput(merged, " ");
    }

    private static void printOutput(List<Integer> input, String delimiter) {
        final List<String> collect = input.stream()
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.println(String.join(delimiter, collect));
    }

    private static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);

        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}