package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            System.out.println(checkIsPalindrome(number));
            input = scanner.nextLine();
        }
    }

    public static boolean checkIsPalindrome(int number) {
        boolean result = false;
        int temp = number;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        if (reverse == temp) {
            result = true;
        }
        return result;
    }
}
