package AssociativeArrays;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, Product> products = new LinkedHashMap<>();
        while (!line.equals("buy")) {
            String[] data = line.split("\\s+");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);
            if (products.containsKey(name)) {
                products.get(name).setPrice(price);
                products.get(name).setQuantity(products.get(name).getQuantity() + quantity);
            } else {
                products.put(name, new Product(name, price, quantity));
            }

            line = scanner.nextLine();
        }
        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.getPrice() * v.getQuantity()));
    }

    static class Product {
        String name;
        double price;
        double quantity;

        public Product(String name, double price, double quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }
    }
}









