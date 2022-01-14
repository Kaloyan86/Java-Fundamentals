package BasicSyntaxConditionalStatementsandLoopsExercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0.0;
        int keyboardTrashes = 0;
        for (int i = 1; i <= lostGames; i++) {
            // Every second lost game, Peter trashes his headset.
            if (i % 2 == 0) {
                expenses += headsetPrice;
            }
            // Every third lost game, Peter trashes his mouse.
            if (i % 3 == 0) {
                expenses += mousePrice;
            }
            // When Peter trashes both his mouse and headset
            // in the same lost game, he also trashes his keyboard.
            if (i % 2 == 0 && i % 3 == 0) {
                keyboardTrashes++;
                expenses += keyboardPrice;
                //Every second time, when he trashes his keyboard,
                // he also trashes his display.
                if (keyboardTrashes % 2 == 0) {
                    expenses += displayPrice;
                }
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
