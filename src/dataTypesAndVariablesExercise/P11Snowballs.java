package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSnowballs = Integer.parseInt(scanner.nextLine());
        double snowBallBestValue = Double.MIN_VALUE;
        int snowballShowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int snowball = 1; snowball <=numberSnowballs ; snowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowBallValue = Math.pow((double)snowballSnow / snowballTime,snowballQuality);

            if (snowBallValue > snowBallBestValue) {
                snowBallBestValue = snowBallValue;
                snowballShowBiggest = snowballSnow;
                snowballTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;

            }

        }
        System.out.printf("%d : %d = %.0f (%d)", snowballShowBiggest, snowballTimeBiggest, snowBallBestValue, snowballQualityBiggest);
    }
}
