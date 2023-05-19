package lists;

import java.util.*;
import java.util.stream.Collectors;

public class P06ListOfProducts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int count = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            final String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + "." + products.get(i));
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
