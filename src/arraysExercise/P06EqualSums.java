package arraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(el -> Integer.parseInt(el)).toArray();

        boolean isFound = false;

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentElement = numbers[index];
            int leftSum = 0;
            int rightSum = 0;


            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }


            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            //проверка дали сумите са равни
            if (leftSum == rightSum) {
                System.out.println(index);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }

    }
}