package textProcessingExercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputData = input.split("\\\\");
        String fileName = inputData[inputData.length -1].split("\\.")[0];
        String fileExtension = inputData[inputData.length -1].split("\\.")[1];


        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtension);
    }
}
