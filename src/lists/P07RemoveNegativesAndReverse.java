package lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .filter(number -> number > 0)
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            printOutput(numbers, " ");
        }
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