package BasicSyntaxConditionalStatementsandLoopsExercises;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int num = 0;
        boolean isDivisible = true;
        // 2, 3, 6, 7, 10
        if (number % 10 == 0) {
            num = 10;
        } else if (number % 7 == 0) {
            num = 7;
        } else if (number % 6 == 0) {
            num = 6;
        } else if (number % 3 == 0) {
            num = 3;
        } else if (number % 2 == 0) {
            num = 2;
        } else {
            isDivisible = false;
        }

        if (isDivisible) {
            System.out.printf("The number is divisible by %d", num);
        }else {
            System.out.println("Not divisible");
        }


    }
}
