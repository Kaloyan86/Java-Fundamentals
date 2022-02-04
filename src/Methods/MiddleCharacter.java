package Methods;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);
    }

    public static void printMiddleChar(String text) {
        if (text.length() % 2 == 0) {
            // 3245
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2));
        }else {
            // aString 7 / 2 = 3
            System.out.print(text.charAt(text.length() / 2));
        }
    }
}
