import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 4;
        double number2 = 5.5;
        String text = "SoftUni";
        char symbol = 'S';
        boolean isTrue = true;

        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();

        System.out.printf("Age1: %d%n" +
                "Age2: %d%n" +
                "Age3: %d%n", age1, age2, age3);
    }
}
