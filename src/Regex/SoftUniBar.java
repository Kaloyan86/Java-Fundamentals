package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$.]*?<(?<product>\\w+)>[^|$.]*?\\|(?<count>\\d+)\\|[^|$.]*?(?<price>\\d+\\.?\\d+)\\$");
        double income = 0;
        String line = scanner.nextLine();
        while (!line.equals("end of shift")) {
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double currentIncome = count * price;
                income += currentIncome;
                System.out.printf("%s: %s - %.2f%n", name, product, currentIncome);
            }

            line = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", income);
    }
}
