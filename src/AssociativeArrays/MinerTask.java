package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (!key.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(key, 0);
            resources.put(key, resources.get(key) + quantity);

            key = scanner.nextLine();
        }
        resources.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));
    }
}
