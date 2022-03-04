package AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasWinner = false;
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, String> legendaryItems = new HashMap<>();
        legendaryItems.put("shards", "Shadowmourne obtained!");
        legendaryItems.put("fragments", "Valanyr obtained!");
        legendaryItems.put("motes", "Dragonwrath obtained!");

        String winner = "";
        while (!hasWinner) {
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length - 1; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String resource = data[i + 1].toLowerCase();

                items.putIfAbsent(resource, 0);
                items.put(resource, items.get(resource) + quantity);

                if (resource.equals("shards") ||
                        resource.equals("fragments") || resource.equals("motes")) {

                    if (items.get(resource) >= 250) {
                        items.put(resource, items.get(resource) - 250);
                        winner = resource;
                        hasWinner = true;
                        break;
                    }
                }
            }
        }
        System.out.println(legendaryItems.get(winner));
        items.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));
    }
}
