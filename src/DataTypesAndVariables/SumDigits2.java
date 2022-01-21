package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number != 0){
            int digit = number %10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
