package BasicSyntaxConditionalStatementsandLoopsExercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        boolean isLogged = false;
        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.printf("User %s logged in.", username);
                isLogged = true;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        }
        if (!isLogged) {
            System.out.printf("User %s blocked!", username);

        }
    }
}
