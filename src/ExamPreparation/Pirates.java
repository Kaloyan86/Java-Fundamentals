package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, Town> towns = new LinkedHashMap<>();

        while (!line.equals("Sail")) {
            String[] data = line.split("\\|\\|");

            String name = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);

            if (towns.containsKey(name)) {
                Town town = towns.get(name);
                town.setGold(town.getGold() + gold);
                town.setPopulation(town.getPopulation() + population);
            } else {
                Town town = new Town(name, population, gold);
                towns.put(name, town);
            }

            line = scanner.nextLine();
        }

        line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("=>");
            String event = data[0];
            String name = data[1];

            Town town = towns.get(name);

            switch (event) {
                case "Plunder":
                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);
                    town.setGold(town.getGold() - gold);
                    town.setPopulation(town.getPopulation() - people);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", name, gold, people);
                    if (town.getGold() == 0 || town.getPopulation() == 0) {
                        System.out.printf("%s has been wiped off the map!\n", name);
                        towns.remove(town.getName());
                    }

                    break;
                case "Prosper":
                    gold = Integer.parseInt(data[2]);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        line = scanner.nextLine();
                        continue;
                    }
                    town.setGold(town.getGold() + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold, name, town.getGold());
                    break;
            }

            line = scanner.nextLine();
        }
        if (towns.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", towns.size());
            towns.values().forEach(System.out::println);

        }

    }

    static class Town {
        String name;
        int population;
        int gold;

        public Town(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        @Override
        public String toString() {
            return String.format("%s -> Population: %d citizens, Gold: %d kg", name, population, gold);
        }
    }
}
