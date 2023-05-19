package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).toList();
            String command = commandLine.get(0);
            switch (command) {
                case "Contains" -> {
                    int number = Integer.parseInt(commandLine.get(1));
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                }
                case "Print" -> {
                    String type = commandLine.get(1);
                    if (type.equals("even")) {
                        printEvenElement(numbers);
                    } else {
                        printOddElement(numbers);
                    }
                }
                case "Get" -> System.out.println(getSum(numbers));
                case "Filter" -> {
                    String condition = commandLine.get(1);
                    int numberForFilter = Integer.parseInt(commandLine.get(2));
                    printFilteredElement(numbers, condition, numberForFilter);
                }
            }
            input = scanner.nextLine();

        }

    }

    public static void printFilteredElement(List<Integer> numbersList, String condition, int num) {
        for (Integer integer : numbersList) {
            switch (condition) {
                case ">" -> {
                    if (integer > num) {
                        System.out.print(integer + " ");
                    }
                }
                case "<" -> {
                    if (integer < num) {
                        System.out.print(integer + " ");
                    }
                }
                case "<=" -> {
                    if (integer <= num) {
                        System.out.print(integer + " ");
                    }
                }
                case ">=" -> {
                    if (integer >= num) {
                        System.out.print(integer + " ");
                    }
                }
            }
        }
        System.out.println();
    }

    public static int getSum(List<Integer> numbersList) {
        int sum = 0;
        for (Integer integer : numbersList) {
            sum += integer;
        }
        return sum;
    }

    public static void printEvenElement(List<Integer> numbersList) {
        for (Integer integer : numbersList) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    public static void printOddElement(List<Integer> numbersList) {
        for (Integer integer : numbersList) {
            if (integer % 2 != 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }
}