package MidExam;

import java.util.Scanner;

public class P01ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());
        int battlesCount = Integer.parseInt(scanner.nextLine());
        double currentExperience = 0;
        int currentBattle = 0;

        for (int battles = 1; battles <=battlesCount ; battles++) {
            double experienceEarnedPerBattle = Double.parseDouble(scanner.nextLine());

            if (battles % 3 == 0 && battles % 5 != 0 && battles % 15 != 0) {
                experienceEarnedPerBattle = experienceEarnedPerBattle + (experienceEarnedPerBattle * 0.15);
            } else if (battles % 5 == 0 && battles % 3 != 0 && battles % 15 != 0) {
                experienceEarnedPerBattle = experienceEarnedPerBattle - (experienceEarnedPerBattle * 0.10);
            } else if (battles % 15 == 0 && battles % 3 != 0 && battles % 5 != 0) {
                experienceEarnedPerBattle = experienceEarnedPerBattle + (experienceEarnedPerBattle * 0.05);
            }
            currentExperience += experienceEarnedPerBattle;
            if (currentExperience >= neededExperience) {
                currentBattle = battles;
                break;
            }

        }

        if (currentExperience >= neededExperience) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", currentBattle);

        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience - currentExperience);
        }
        
    }
}
