package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("Remove")) {
                int numberToDelete = Integer.parseInt(command.split("\\s+")[1]);
                numbers.remove(Integer.valueOf(numberToDelete));
            } else if (command.contains("Replace")) {
                int numberToReplace = Integer.parseInt(command.split("\\s+")[1]);
                int numberToBeReplaced = Integer.parseInt(command.split("\\s+")[2]);
                int index = numbers.indexOf(numberToReplace);
                if (index != -1) {
                    numbers.set(index, numberToBeReplaced);
                }


            } else if (command.contains("Collapse")) {
                int numberToCollapse = Integer.parseInt(command.split("\\s+")[1]);
                numbers.removeIf(number -> number < numberToCollapse);
            }
            command = scanner.nextLine();
        }

        for (int numberToPrint : numbers) {
            System.out.print(numberToPrint + " ");
        }


    }
}
