package Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Delete":
                    // TODO extract in method
                    int element = Integer.parseInt(data[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == element) {
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    // TODO extract in method
                    element = Integer.parseInt(data[1]);
                    int position = Integer.parseInt(data[2]);
                    numbers.add(position, element);
                    break;
            }

            line = scanner.nextLine();
        }
        numbers.forEach(el -> System.out.print(el + " "));
    }
}
