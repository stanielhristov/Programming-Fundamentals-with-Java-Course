package arraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        for (String elementSecondArray:secondArray) {
            for (String elementFirstArray:firstArray) {
                if (elementFirstArray.equals(elementSecondArray)) {
                    System.out.print(elementFirstArray + " ");
                    break;
                }

            }

        }



    }
}
