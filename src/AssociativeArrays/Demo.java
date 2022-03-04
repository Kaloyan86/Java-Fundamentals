package AssociativeArrays;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Map<String, Map<String, String>> demoMap = new HashMap<>();

        demoMap.put("Kaloyan", new HashMap<>());
        demoMap.get("Kaloyan").put("Student", "Sofia");
        System.out.println();
        // Phone book -> <name - phone number>
        Map<String, Person> phoneBook = new LinkedHashMap<>();

        Person peter = new Person("Peter", "123454");
        Person anton = new Person("Anton", "00000");
        Person sofia = new Person("Sofia", "11111");
        phoneBook.put(peter.getName(), peter);
        phoneBook.put(anton.getName(), anton);
        phoneBook.put(sofia.getName(), sofia);

        phoneBook.forEach((key, value) -> System.out.printf("Name: %s --- Phone: %s%n", key, value.getPhoneNumber()));

    }

    static class Person {
        String name;
        String phoneNumber;


        public Person(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
}
