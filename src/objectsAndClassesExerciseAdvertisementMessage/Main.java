package objectsAndClassesExerciseAdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Message message = new Message();
        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <numberOfMessages ; i++) {
            String output = message.randomMessage();
            System.out.println(output);

        }

    }
}
