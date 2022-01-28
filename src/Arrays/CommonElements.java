package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

//        for (String secondElement : secondArr) {
//            // iterate firstArr
//            for (String firstElement : firstArr) {
//                if (secondElement.equals(firstElement)) {
//                    System.out.print(firstElement + " ");
//                }
//            }
//        }
        for (int i = 0; i < secondArr.length; i++) {
            String secondElement = secondArr[i];
            // iterate firstArr
            for (String firstElement : firstArr) {
                if (secondElement.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                }
            }
        }
    }
}
