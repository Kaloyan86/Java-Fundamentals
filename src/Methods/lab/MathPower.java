package Methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = mathPower(base, power);
        System.out.println(new DecimalFormat("0.####").format(result));

    }

    public static double mathPower(double base, int power) {
        double result = 1;
        result = Math.pow(base, power);
        return result;
    }
}
