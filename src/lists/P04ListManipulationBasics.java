package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("end")) {
            final String command = commandLine.split(" ")[0];

            switch (command) {
                case "Add":
                    input.add(Integer.parseInt(commandLine.split(" ")[1]));
                    break;
                case "Remove":
                    input.remove(Integer.valueOf(commandLine.split(" ")[1]));
                    break;
                case "RemoveAt":
                    input.remove(Integer.parseInt(commandLine.split(" ")[1]));
                    break;
                case "Insert":
                    final int element = Integer.parseInt(commandLine.split(" ")[1]);
                    final int index = Integer.parseInt(commandLine.split(" ")[2]);
                    input.add(index, element);
            }

            commandLine = scanner.nextLine();
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