package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            Integer parseInt = Integer.parseInt(s);
            numbersList.add(parseInt);
        }
        String commandLine = scanner.nextLine();
        int bombs = Integer.parseInt(commandLine.split(" ")[0]);
        int power = Integer.parseInt(commandLine.split(" ")[1]);

        if (numbersList.contains(bombs)) {
            int i = 0;
            while (i < numbersList.size()) {
                int currentElement = numbersList.get(i);
                if (currentElement == bombs) {
                    int startIndex = i - power;
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    int endIndex = i + power;
                    if (endIndex > numbersList.size() - 1) {
                        endIndex = numbersList.size() - 1;
                    }

                    for (int j = startIndex; j <=endIndex ; j++) {
                        numbersList.set(j,0);
                    }

                }
                i++;
            }
        }
        int sum = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            sum += numbersList.get(i);
        }
        System.out.println(sum);
    }
}