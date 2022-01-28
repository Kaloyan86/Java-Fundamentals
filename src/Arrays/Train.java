package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagons];

        int allPeople = 0;
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            allPeople += train[i];
            System.out.print(train[i] + " ");
        }

       // Arrays.stream(train).forEach(wagon -> System.out.print(wagon + " "));
        System.out.printf("\n%s", allPeople);
    }
}
