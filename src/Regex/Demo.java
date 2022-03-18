package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(?<productName>[a-zA-z]+)(?<price>[\\d]+)";
            String text = "Product123";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group("productName"));
            System.out.println(matcher.group("price"));
        }

    }
}
