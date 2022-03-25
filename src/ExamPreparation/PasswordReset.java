package ExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // message
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();
        while (!line.equals("Reveal")) {
            String[] data = line.split(":\\|:");
            String command = data[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    sb.insert(index, " ");
                    break;
                case "Reverse":
                    StringBuilder substring = new StringBuilder(data[1]);
                    if (sb.toString().contains(substring)) {
                        // !gnil    hellodar!!gnil
                        int start = sb.indexOf(substring.toString());
                        int end = start + substring.length() - 1;
                        sb.delete(start, end + 1);
                        substring.reverse();
                        sb.append(substring);
                    } else {
                        System.out.println("error");
                        line = scanner.nextLine();
                        continue;
                    }

                    break;
                case "ChangeAll":
                    String occurrence = data[1];
                    String replacement = data[2];
                    String replacedString = sb.toString().replaceAll(occurrence, replacement);
                    sb.setLength(0);
                    sb.append(replacedString);
                    break;
            }
            System.out.println(sb);
            line = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", sb.toString());
    }
}
