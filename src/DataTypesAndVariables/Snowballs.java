package DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxSnowBallValue = 0;
        int maxSnowBallSnow = 0;
        int maxSnowBallTime = 0;
        int maxSnowBallQuality = 0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            // (snowballSnow / snowballTime) ^ snowballQuality
            double currentSnowBallValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (currentSnowBallValue > maxSnowBallValue) {
                maxSnowBallValue = currentSnowBallValue;
                maxSnowBallSnow = snowballSnow;
                maxSnowBallTime = snowballTime;
                maxSnowBallQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)"
                , maxSnowBallSnow, maxSnowBallTime, maxSnowBallValue, maxSnowBallQuality);
    }
}
