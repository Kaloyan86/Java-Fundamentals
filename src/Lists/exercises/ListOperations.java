package Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Add":
                    numbers.add(Integer.parseInt(data[1]));
                    break;
                case "Insert":
                    int number = Integer.parseInt(data[1]);
                    int index = Integer.parseInt(data[2]);
                    insert(number, index, numbers);
                    break;
                case "Remove":
                    index = Integer.parseInt(data[1]);
                    if (index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(data[2]);
                    if (data[1].equals("left")) {
                        // 1 2 3 4 5   count = 2    3 4 5 1 2
                        for (int i = 0; i < count; i++) {
                            // add first element in the end of the list
                            numbers.add(numbers.get(0));
                            // remove first element
                            numbers.remove(0);
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            // add last element to the first position
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            // remove last element
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;


            }
            line = scanner.nextLine();
        }
        numbers.forEach(el -> System.out.print(el + " "));
    }

    public static void insert(int element, int index, List<Integer> nums) {
        if (index < 0 || index >= nums.size()) {
            System.out.println("Invalid index");
        } else {
            nums.add(index, element);
        }
    }

}
