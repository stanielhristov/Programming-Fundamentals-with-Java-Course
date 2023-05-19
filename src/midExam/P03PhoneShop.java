package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> telephones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" - ");

        while (!command[0].equals("End")) {

            String action = command[0];

            switch (action) {
                case "Add":
                    if (!telephones.contains(command[1])) {
                        telephones.add(command[1]);
                    }
                    break;
                case "Remove":
                    telephones.remove(command[1]);
                    break;
                case "Bonus phone":
                    String oldPhone = command[1].split(":")[0];
                    String newPhone = command[1].split(":")[1];
                    int oldTelephoneIndex = telephones.indexOf(oldPhone);

                    if (oldTelephoneIndex != -1) {
                        telephones.add(oldTelephoneIndex +1 , newPhone);
                    }
                    break;
                case "Last":
                    if (telephones.remove(command[1])) {
                        telephones.add(command[1]);
                    }

                    break;
            }
            command = scanner.nextLine().split(" - ");

        }
        System.out.printf(String.join(", ", telephones));

    }
}
