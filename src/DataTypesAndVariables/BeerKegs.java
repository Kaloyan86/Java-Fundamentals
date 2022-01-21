package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0;
        String maxKegModel = "";
        for (int i = 0; i < kegs; i++) {
            String model = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());
            // π * r^2 * h.
            double currentVolume = Math.PI * Math.pow(r, 2) * h;
            if (currentVolume > maxVolume){
                maxVolume = currentVolume;
                maxKegModel = model;
            }
        }
        System.out.println(maxKegModel);
    }
}
