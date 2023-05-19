package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {

    public static void main(String[] args) {

        final List<Integer> input = readInput();
        final int size = input.size();

        for (int i = 0; i < size / 2; i++) {
            int sum = input.get(i) + input.get(input.size() - 1);
            input.set(i, sum);
            input.remove(input.size() - 1);
        }

        printOutput(input, " ");
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