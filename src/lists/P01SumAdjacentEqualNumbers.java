package lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final List<Double> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i).equals(input.get(i + 1))) {
                double sum = input.get(i) + input.get(i + 1);

                input.set(i, sum);
                input.remove(i + 1);
                i = -1;
            }

        }

        System.out.println(printElementsByDelimeter(input, " "));
    }

    private static String printElementsByDelimeter(List<Double> input, String example) {
        StringBuilder output = new StringBuilder();

        for (Double item : input) {
            output.append(new DecimalFormat("0.#").format(item))
                    .append(example);
        }

        return output.toString();
    }
}